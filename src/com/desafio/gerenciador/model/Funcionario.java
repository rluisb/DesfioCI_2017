package com.desafio.gerenciador.model;

import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private Double salario;
	private Double seguroDeVida;
	private Double inss;
	private Double valeRefeicao;
	private Double valeTransporte;
	private Double totalDeCustos;
	private LocalDate contratacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getSeguroDeVida() {
		return seguroDeVida;
	}

	public void setSeguroDeVida(Double seguroDeVida) {
		this.seguroDeVida = seguroDeVida;
	}

	public Double getInss() {
		return inss;
	}

	public void setInss(Double inss) {
		this.inss = inss;
	}

	public Double getValeRefeicao() {
		return valeRefeicao;
	}

	public void setValeRefeicao(Double valeRefeicao) {
		this.valeRefeicao = valeRefeicao;
	}

	public Double getValeTransporte() {
		return valeTransporte;
	}

	public void setValeTransporte(Double valeTransporte) {
		this.valeTransporte = valeTransporte;
	}

	public Double getTotalDeCustos() {
		return totalDeCustos;
	}

	public void setTotalDeCustos(Double totalDeCustos) {
		this.totalDeCustos = totalDeCustos;
	}

	public LocalDate getContratacao() {
		return contratacao;
	}

	public void setContratacao(LocalDate contratacao) {
		this.contratacao = contratacao;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", seguroDeVida=" + seguroDeVida + ", inss="
				+ inss + ", valeRefeicao=" + valeRefeicao + ", valeTransporte=" + valeTransporte + ", totalDeCustos="
				+ totalDeCustos + ", contratacao=" + contratacao + "]";
	}

}
