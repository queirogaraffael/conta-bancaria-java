package com.contaBancaria.entities;

public class Account {
	private int numero;
	private String nomeTitular;
	private double saldo;

	public Account() {
	}

	public Account(int numero, String nomeTitular, double saldo) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double quantidade) {
		saldo += quantidade;
	}

	public void saque(double quantia) {
		saldo = saldo - quantia - 5;
	}

	@Override
	public String toString() {
		return "Dados da conta: Account " + numero + ", Holder: " + nomeTitular + ", Balance: $"
				+ String.format("%.2f", saldo);
	}

}