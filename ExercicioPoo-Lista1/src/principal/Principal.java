/**
 * 
 */
package principal;

import entidade.Conta;

/**
 * @author tatianirodrigues
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta1 = new Conta("123-7", "12345-6", 300);

		System.out.println("Valor sacado: " + conta1.sacar(250));
		System.out.println("Valor atual da conta: " + conta1.getSaldo());

		System.out.println("Valor sacado: " + conta1.sacar(300));
		System.out.println("Valor atual da conta: " + conta1.getSaldo());

		conta1.depositar(200);
		System.out.println("Valor atual da conta: " + conta1.getSaldo());

		conta1.efetuarRendimento(0.5);
		System.out.println("Valor atual da conta: " + conta1.getSaldo());

		conta1.efetuarRendimento(0.8);
		System.out.println("Valor atual da conta: " + conta1.getSaldo());
	}

}
