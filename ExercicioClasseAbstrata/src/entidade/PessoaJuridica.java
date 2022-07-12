/**
 * 
 */
package entidade;

/**
 * @author tatianirodrigues
 *
 */
public class PessoaJuridica extends Pessoa{

	private String cnpj;

	//Construtores
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	//Getters and Setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public boolean verificarAdimplencia() {
		double somaSaldos = 0;
		for (Conta contaAtual: super.getContas()) {
			somaSaldos += contaAtual.getSaldo();
		}
		if (somaSaldos > -1000) {
			super.setAdimplente(true);
			return super.isAdimplente();
		}else {
			super.setAdimplente(false);
			return super.isAdimplente();
		}	
	}
}
