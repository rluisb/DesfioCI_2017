package com.desafio.gerenciador.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivo {
	public BufferedReader leitor(String path) throws IOException {
		FileReader arq = new FileReader(path);
		BufferedReader buffRead = new BufferedReader(arq);
		return buffRead;
	}
}
