package com.desafio.gerenciador.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

import com.desafio.gerenciador.controller.FuncionarioController;
import com.desafio.gerenciador.enumerators.Impressora;
import com.desafio.gerenciador.model.Funcionario;
import com.desafio.gerenciador.utils.FormatadorDeData;
import com.desafio.gerenciador.utils.LeitorDeArquivo;

public class Main {

	public static void main(String[] args) throws IOException {
		FuncionarioController funcionarioController = new FuncionarioController();
		String path = System.getProperty("user.dir") + "/files/infos.txt";

		LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();
		BufferedReader readFile = leitorDeArquivo.leitor(path);

		String linha = "";

		while ((linha = readFile.readLine()) != null) {
			StringTokenizer tokenizer = new StringTokenizer(linha, ";");
			Funcionario funcionario = new Funcionario();

			funcionario.setNome(tokenizer.nextToken());
			funcionario.setSalario(Double.parseDouble(tokenizer.nextToken()));
			funcionario.setContratacao(FormatadorDeData.converteStringParaLocalDate(tokenizer.nextToken()));
			funcionarioController.salvar(funcionario);
		}

		Impressora.IMPRIMIR_FUNCIONARIOS.imprimir();
		Impressora.IMPRIMIR_TOTAIS.imprimir();
	}

}
