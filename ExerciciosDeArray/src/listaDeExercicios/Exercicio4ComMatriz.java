/**
 * 
 */
package listaDeExercicios;

import java.util.Scanner;

/**
 * @author tati
 *
 */
public class Exercicio4ComMatriz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		double [][] notas = new double [10][2];
		double soma = 0, media = 0;
		String [] nomes = new String [10];


		for (int i =0; i<notas.length; i ++) {
			System.out.println("Aluno "  + (i+1) +"\n-------------");
			System.out.println("Nome do Aluno: ");
			nomes [i] = entrada.nextLine();
		
			for (int j =0; j<notas[i].length; j++) {
				System.out.println("Nota " + (j+1) + ":");
				notas[i][j] = entrada.nextDouble();
				entrada.nextLine();
			}
		}
		for (int i =0; i<notas.length; i ++) {
			
			soma = 0; // tem que esta aqui para zerar a soma na prox iteração

			System.out.println("---------------------------------");
			System.out.print("As notas de " + nomes[i] + " são: ");


			for (int j =0; j<notas[i].length; j++) {

				if((j + 1) < notas [i].length) {
					System.out.print(notas [i][j] + ",");
				}
				else {
					System.out.print(notas [i][j] + ".");
				}
			}

			for (int j =0; j<notas[i].length; j++) {
				soma += notas[i][j];
				media = soma/ (j+1);
			}
			
			System.out.println("\nSua média é: " + media);

			if (media >= 7) {
				System.out.println("Aprovado!!");
			}
			else {
				System.out.println("Repovado :(");
			}
	}
	}

}
