/**
 * 
 */
package listaDeExercicios;

import java.util.Scanner;

/**
 * @author tati
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros [] = new int [10];
		int soma =0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o numero " + (i+1) + ": ");
			numeros[i]	 = entrada.nextInt();
			
			soma += numeros [i];
		}
		System.out.print("Lista: ");
		for (int i = 0; i < numeros.length; i++) {
			if((i + 1) < numeros.length) {
				System.out.print(numeros [i] + ",");
			}
			else {
				System.out.print(numeros [i] + ".");
			}
		}
		System.out.println("\nSoma: " + soma);
	}

}
