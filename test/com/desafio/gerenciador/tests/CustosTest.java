package com.desafio.gerenciador.tests;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.desafio.gerenciador.enumerators.Custo;

public class CustosTest {

	@BeforeClass
	public static void iniciaValores() {
		Double salario = 1000.0;
		Custo.INSS.getValorCusto(salario);
		Custo.SEGURO_DE_VIDA.getValorCusto(salario);
		Custo.VALE_REFEICAO.getValorCusto(salario);
		Custo.VALE_TRANSPORTE.getValorCusto(salario);
		Custo.CUSTO_TOTAL.getValorCusto(salario);
	}

	@Test
	public void getValorCustoFinalInssTest() {
		Double valorEsperado = 100.0;
		assertEquals(valorEsperado, Custo.INSS.getValorCustoFinal(), 0);
	}

	@Test
	public void getValorCustoFinalSeguroDeVidaTest() {
		Double valorEsperado = 150.0;
		assertEquals(valorEsperado, Custo.SEGURO_DE_VIDA.getValorCustoFinal(), 0);
	}

	@Test
	public void getValorCustoFinalValeRefeicaoTest() {
		Double valorEsperado = 110.0;
		assertEquals(valorEsperado, Custo.VALE_REFEICAO.getValorCustoFinal(), 0);
	}

	@Test
	public void getValorCustoFinalValeTransporteTest() {
		Double valorEsperado = 50.0;
		assertEquals(valorEsperado, Custo.VALE_TRANSPORTE.getValorCustoFinal(), 0);
	}

	@Test
	public void getValorCustoFinalTest() {
		Double valorEsperado = 1410.0;
		assertEquals(valorEsperado, Custo.CUSTO_TOTAL.getValorCustoFinal(), 0);
	}

}
