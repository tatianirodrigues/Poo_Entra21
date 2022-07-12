/**
 * 
 */
package entidade;

/**
 * @author tatianirodrigues
 *
 */
public class Conta {

	private String numeroConta;
	private String numeroAgencia;
	private double saldo;

	//Construtor

	public Conta (String numeroConta, String numeroAgencia, double saldo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public Conta () {

	}

	//Métodos
	public double sacar(double valorSaque) {
		this.saldo -= valorSaque;
		return valorSaque;
	}

	public void depositar(double valorDepo) {
		this.saldo += valorDepo;
	}

	public void efetuarRendimento(double percentualRendimento) {
		this.saldo *= ( 1 + (percentualRendimento/100));
	}

	// Getters and Setters
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public double getSaldo() {
		return saldo;
	}
}
