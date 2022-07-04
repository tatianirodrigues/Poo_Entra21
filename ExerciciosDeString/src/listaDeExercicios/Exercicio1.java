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
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = entrada.nextLine();
		
		int n = frase.split(" ").length; // slipt (" ") -> divide a frase nos espacos em branco
		System.out.println((n) + " palavras");
	}

}
