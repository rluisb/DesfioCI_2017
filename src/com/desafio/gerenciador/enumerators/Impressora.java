package com.desafio.gerenciador.enumerators;

import java.text.NumberFormat;

import com.desafio.gerenciador.dao.FuncionarioDAO;

public enum Impressora {

	IMPRIMIR_FUNCIONARIOS {
		@Override
		public void imprimir() {
			funcionarioDAO.getDataBase()
					.forEach(funcionario -> System.out.println("Nome: " + funcionario.getNome() + "; INSS: "
							+ NumberFormat.getCurrencyInstance().format(funcionario.getInss()) + "; SegVida: " + NumberFormat.getCurrencyInstance().format(funcionario.getSeguroDeVida()) + "; VR: "
							+ NumberFormat.getCurrencyInstance().format(funcionario.getValeRefeicao()) + "; VT: " + NumberFormat.getCurrencyInstance().format(funcionario.getValeTransporte())
							+ "; CustoTotal: " + NumberFormat.getCurrencyInstance().format(funcionario.getTotalDeCustos())));
		}
	},
	IMPRIMIR_TOTAIS {
		@Override
		public void imprimir() {
			Total.TOTAL_IMPOSTOS.calculaTotal();
			Total.TOTAL_SALARIOS.calculaTotal();
			Total.TOTAL_GERAL.calculaTotal();
			System.out.println("Total Impostos: " + NumberFormat.getCurrencyInstance().format(Total.TOTAL_IMPOSTOS.getTotal()));
			System.out.println("Total Salarios: " + NumberFormat.getCurrencyInstance().format(Total.TOTAL_SALARIOS.getTotal()));
			System.out.println("Total Geral: " + NumberFormat.getCurrencyInstance().format(Total.TOTAL_GERAL.getTotal()));
			
		}
	};

	private static FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

	public abstract void imprimir();

}
