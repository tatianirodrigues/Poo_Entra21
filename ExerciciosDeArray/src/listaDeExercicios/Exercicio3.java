/**
 * 
 */
package listaDeExercicios;

import java.util.Scanner;

/**
 * @author tati
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int lista [] = new int [10];
		int restoDiv, soma = 0, nImpares = 0, media;
		
		for ( int i = 0; i < lista.length; i++) {
			System.out.println("Digite o numero " + (i+1) + ":");
			lista[i] = entrada.nextInt();
		}
		System.out.print("Lista: ");
		for ( int i = 0; i < lista.length; i++) {
			
			if((i + 1) < lista.length) {
				System.out.print(lista [i] + ",");
			}
			else {
				System.out.print(lista [i] + ".");
			}
			
			restoDiv = lista[i]%2;
			
			if (restoDiv != 0) {
				soma += lista[i];
				nImpares ++;
			}
		}
		media = soma/nImpares;
		System.out.println("\nMedia dos números impares: " + media);
	}

}
