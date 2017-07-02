package com.desafio.gerenciador.enumerators;

public enum Custo {

	INSS {
		@Override
		public void getValorCusto(Double salario) {
			Custo.inss = (10.0 / 100) * salario;
		}

		@Override
		public Double getValorCustoFinal() {
			return Custo.inss;
		}
	},
	SEGURO_DE_VIDA {
		@Override
		public void getValorCusto(Double salario) {
			Custo.seguroDeVida = (15.0 / 100) * salario;
		}

		@Override
		public Double getValorCustoFinal() {
			return Custo.seguroDeVida;
		}
	},
	VALE_REFEICAO {
		@Override
		public void getValorCusto(Double salario) {
			Custo.valeRefeicao = (11.0 / 100) * salario;
		}

		@Override
		public Double getValorCustoFinal() {
			return Custo.valeRefeicao;
		}
	},
	VALE_TRANSPORTE {
		@Override
		public void getValorCusto(Double salario) {
			Custo.valeTransporte = (5.0 / 100) * salario;
		}

		@Override
		public Double getValorCustoFinal() {
			return Custo.valeTransporte;
		}
	},
	CUSTO_TOTAL {
		@Override
		public void getValorCusto(Double salario) {
			Custo.custoTotal = Custo.INSS.getValorCustoFinal() + Custo.SEGURO_DE_VIDA.getValorCustoFinal()
					+ Custo.VALE_REFEICAO.getValorCustoFinal() + Custo.VALE_TRANSPORTE.getValorCustoFinal() + salario;
		}

		@Override
		public Double getValorCustoFinal() {
			return Custo.custoTotal;
		}
	};

	private static Double inss = 0.0;
	private static Double seguroDeVida = 0.0;
	private static Double valeRefeicao = 0.0;
	private static Double valeTransporte = 0.0;
	private static Double custoTotal = 0.0;

	public abstract void getValorCusto(Double salario);

	public abstract Double getValorCustoFinal();
}
