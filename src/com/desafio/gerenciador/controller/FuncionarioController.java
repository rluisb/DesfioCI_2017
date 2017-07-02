package com.desafio.gerenciador.controller;

import com.desafio.gerenciador.dao.FuncionarioDAO;
import com.desafio.gerenciador.enumerators.Custo;
import com.desafio.gerenciador.model.Funcionario;

public class FuncionarioController {

	private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

	private void calculaCustos(Funcionario funcionario) {
		Custo.INSS.getValorCusto(funcionario.getSalario());
		Custo.SEGURO_DE_VIDA.getValorCusto(funcionario.getSalario());
		Custo.VALE_REFEICAO.getValorCusto(funcionario.getSalario());
		Custo.VALE_TRANSPORTE.getValorCusto(funcionario.getSalario());
		Custo.CUSTO_TOTAL.getValorCusto(funcionario.getSalario());
		
		funcionario.setInss(Custo.INSS.getValorCustoFinal());
		funcionario.setSeguroDeVida(Custo.SEGURO_DE_VIDA.getValorCustoFinal());
		funcionario.setValeRefeicao(Custo.VALE_REFEICAO.getValorCustoFinal());
		funcionario.setValeTransporte(Custo.VALE_TRANSPORTE.getValorCustoFinal());
		funcionario.setTotalDeCustos(Custo.CUSTO_TOTAL.getValorCustoFinal());
	}

	public int salvar(Funcionario funcionario) {
		calculaCustos(funcionario);
		return funcionarioDAO.salvar(funcionario);
	}

}
