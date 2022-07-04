/**
 * 
 */
package listaDeExercicios;

import java.util.Scanner;

/**
 * @author tati
 *
 */
public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner entrada = new Scanner(System.in);
		
		int numeros [] = new int [3];
		int tabuada [] = new int [10];
		
		for (int i= 0; i < numeros.length; i++) {
			System.out.println("Digite um numero entre 0 e 9: ");
			numeros[i]= entrada.nextInt();
				if (numeros[i] >= 0 && numeros[i] <= 9) {
					System.out.println("Tabuta de " + numeros[i] + ":" );
					System.out.println("--------------");
					for (int j = 0; j< tabuada.length; j ++) {
						tabuada [j] = numeros [i] * (j + 1);
						System.out.println( numeros [i]  + "*" + (j + 1 ) + " = "+tabuada [j]);
					}
				}else {
					System.out.println("Numero invalido! Digite um numero entre 0 e 9");
					i--;
				}
		}
	}

}
