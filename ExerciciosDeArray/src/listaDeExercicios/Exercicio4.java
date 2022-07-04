/**
 * 
 */
package listaDeExercicios;

import java.util.Scanner;

/**
 * @author tati
 *
 */
public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double notas1 [] = new double [10];
		double notas2 [] = new double [10];
		String nomes [] = new String [10];
		double media;
		
		for (int i = 0; i < nomes.length; i ++) {
			System.out.println("Nome do Aluno: ");
			nomes [i] = entrada.nextLine();
			System.out.println("Digite a nota 1:");
			notas1 [i] = entrada.nextDouble();
			System.out.println("Digite a nota 2:");
			notas2 [i] = entrada.nextDouble();
			entrada.nextLine();
		}
		
		for (int i = 0; i < nomes.length; i ++){
			media = (notas1[i] + notas2[i])/2;
			
			System.out.println("\nAluna(o) " + nomes[i] + "\n=======================");
			System.out.println("Nota 1: " + notas1[i]);
			System.out.println("Nota 2: " + notas2[i]);
			System.out.println("Media: " + media);
			
			if (media >= 7) {
				System.out.println("Aprovado!!");
			}
			else {
				System.out.println("Reprovado :(");
			}
		}
	}

}
