package com.vitorcamara.projetos;

import java.util.Random;

public class ManipulandoLinhasColunas {

	public static void main(String[] args) {

		int[][] M = new int[10][10];
		Random numeroRandom = new Random();

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = numeroRandom.nextInt(100); // número randômicos vão até 100
			}
		}

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {

				System.out.print(M[i][j] + " "); // nese For de Output 'i' é a linha e 'j' é a coluna
			}

			System.out.println(" ");
		}

		int maiorL5 = 0;
		int menorL5 = 101; // recebe 101, pois números até 100 serão gerados, podendo gerar o próprio 100,
							// em seguida continua procurando menor
		int linha5 = 5;

		for (int i = 0; i < M[5].length; i++) { // esse For percorre o comprimento (lenght) da linha 5

			if (M[linha5][i] > maiorL5) { // esse If vai coletar o maior número da linha 5
				maiorL5 = M[linha5][i];

			}

			if (M[linha5][i] < menorL5) { // esse If coleta o menor número da linha 5
				menorL5 = M[linha5][i];

			}
		}

		System.out.println("\nMaior numero da linha 5: " + maiorL5);
		System.out.println("\nMenor numero da linha 5: " + menorL5);

		int maiorC7 = 0;
		int menorC7 = 101;
		int col7 = 7;

		for (int i = 0; i < M.length; i++) {

			if (M[i][col7] > maiorC7) { // esse If vai coletar o maior número da coluna 7
				maiorC7 = M[i][col7];
			}
			if (M[i][col7] < menorC7) { // esse If vai coletar o menor número da coluna 7
				menorC7 = M[i][col7];
			}
		}

		System.out.println("\nMaior numero da coluna 7: " + maiorC7);
		System.out.println("\nMenor numero da coluna 7: " + menorC7);

	}
}
