package com.desafio.gerenciador.dao;

import java.util.ArrayList;
import java.util.List;

import com.desafio.gerenciador.model.Funcionario;

public class FuncionarioDAO {

	private static final List<Funcionario> dataBase = new ArrayList<Funcionario>();

	public int salvar(Funcionario funcionario) {
		dataBase.add(funcionario);
		return 1;
	}

	public List<Funcionario> getDataBase() {
		return dataBase;
	}
}
