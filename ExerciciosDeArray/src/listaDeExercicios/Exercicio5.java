/**
 * 
 */
package listaDeExercicios;

import java.util.Scanner;

/**
 * @author tati
 *
 */
public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);	
		
		int  origem [] = new int [5];
		int resultado [] = new int [5];
		int verificacao;
		
		for (int i =0; i < origem.length; i++) {
			System.out.println("Digite o numero " + (i+1) + ":");
			origem [i] = entrada.nextInt();
			verificacao = origem [i] % 2;
			
			if (verificacao == 0) {
				resultado [i] = 1;
			}
			else {
				resultado [i] = 0;
			}
		}
		System.out.println("Resultado:");
		for (int i =0; i < resultado.length; i++) {
			if((i + 1) < resultado.length) {
				System.out.print(resultado [i] + ",");
			}
			else {
				System.out.print(resultado [i] + ".");
			}
		}
	}

}
