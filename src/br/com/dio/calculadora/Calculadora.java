package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		
		int soma = Soma(a, b);
		int subtracao = Subtracao(a, b);
		int multiplicacao = Multiplicacao(a, b);
		int divisao = Divisao(a, b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
	}

	public static int Soma(int a, int b) {
		return a + b;
	}
	
	public static int Subtracao(int a, int b) {
		return a - b;
	}
	
	public static int Multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static int Divisao(int a, int b) {
		return a / b;
	}
}
