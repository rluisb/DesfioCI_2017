package com.desafio.gerenciador.enumerators;

import com.desafio.gerenciador.dao.FuncionarioDAO;

public enum Total {

	TOTAL_IMPOSTOS {
		@Override
		public void calculaTotal() {
			funcionarioDAO.getDataBase().forEach(
					funcionario -> Total.totalImpostos += funcionario.getTotalDeCustos() - funcionario.getSalario());
		}

		@Override
		public Double getTotal() {
			return Total.totalImpostos;
		}
	},
	TOTAL_SALARIOS {
		@Override
		public void calculaTotal() {
			funcionarioDAO.getDataBase().forEach(
					funcionario -> Total.totalSalarios += funcionario.getSalario());
		}

		@Override
		public Double getTotal() {
			return Total.totalSalarios;
		}
	},
	TOTAL_GERAL {
		@Override
		public void calculaTotal() {
			funcionarioDAO.getDataBase().forEach(funcionario -> Total.totalGeral += funcionario.getTotalDeCustos());
		}

		@Override
		public Double getTotal() {
			return Total.totalGeral;
		}
	};

	private static Double totalImpostos = 0.0;
	private static Double totalSalarios = 0.0;
	private static Double totalGeral = 0.0;

	private static FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

	public abstract void calculaTotal();

	public abstract Double getTotal();

}
