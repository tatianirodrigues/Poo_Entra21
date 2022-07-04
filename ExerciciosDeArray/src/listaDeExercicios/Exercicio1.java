/**
 * 
 */
package listaDeExercicios;

import java.util.Scanner;

/**
 * @author tati
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros [] = new int [10];
		int x, nPares =0, nTotal =0 ;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o numero " + (i+1) + ": ");
			numeros[i]	 = entrada.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			x = numeros[i]%2;
			if(x==0) {
				nPares++;
				System.out.println("Numeros Pares:" + numeros[i]);
			}
		}
		System.out.println( "Quantidade de números pares: " + nPares);
	}

}
