package atividades;

import java.security.DrbgParameters.NextBytes;
import java.util.Iterator;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int Maior = max(a, b, c);
		resultado(Maior);
		sc.close();
	}

	private static void resultado(int valor) { // void-valor vazio que só irá exibir o valor
		System.out.println("O maior é o " + valor);
	}

	private static int max(int a, int b, int c) {
		int total;
		if (a > b && a > c) {
			total = a;
		} else if (b > c) {
			total = b;
		} else {
			total = c;
		}
		return total; // return para indicar que a função deve retornar o valor
	}
}
