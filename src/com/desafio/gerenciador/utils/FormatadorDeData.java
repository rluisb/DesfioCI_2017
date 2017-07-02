package com.desafio.gerenciador.utils;

import java.time.LocalDate;
import java.util.StringTokenizer;

public class FormatadorDeData {

	public static LocalDate converteStringParaLocalDate(String data) {
		StringTokenizer tokenizer = new StringTokenizer(data, "/");

		String dia = tokenizer.nextToken().trim();
		String mes = tokenizer.nextToken().trim();
		String ano = tokenizer.nextToken().trim();

		String novaData = ano + "-" + mes + "-" + dia;

		LocalDate dataFormatada = LocalDate.parse(novaData);

		return dataFormatada;
	}

}
