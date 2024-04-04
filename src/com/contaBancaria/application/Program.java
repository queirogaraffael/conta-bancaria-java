package com.contaBancaria.application;

import java.util.Scanner;

import com.contaBancaria.entities.Account;

public class Program {

	public static void main(String[] args) {
		Account conta;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o número da conta: ");
		int numeroConta = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Insira o títular da conta: ");
		String nome = scanner.nextLine();

		System.out.println("Existe depósito inicial (s/n) ?");
		char opcao = scanner.next().charAt(0);

		if (opcao == 's') {
			System.out.println("Insira um valor inicial: ");
			double valor = scanner.nextDouble();
			conta = new Account(numeroConta, nome, valor);
		} else {
			conta = new Account(numeroConta, nome, 0);

		}

		System.out.println(conta);

		System.out.println("Insira um valor de depósito: ");
		double valor = scanner.nextDouble();
		conta.depositar(valor);
		System.out.println("Dados da conta atualizado: " + conta);

		System.out.println("Insira um valor de saque: ");
		double saque = scanner.nextDouble();
		conta.saque(saque);
		System.out.println("Dados da conta atualizado: " + conta);

		scanner.close();
	}

}