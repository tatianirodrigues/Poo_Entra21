/**
 * 
 */
package entidade;

/**
 * @author tatianirodrigues
 *
 */

public class PessoaFisica extends Pessoa{

	//Atributos
	private String cpf;
	private String dataNascimento;
	private char sexo;

	//Construtores
	public PessoaFisica() {
	}

	//Métodos
	public int calcularIdade(int anoAtual) {
		int idade = 0;

		//Assumir dd/MM/yyyy
		String anoNascimento = this.dataNascimento.substring(6);
		idade = anoAtual - Integer.valueOf(anoNascimento);

		return idade;
	}

	@Override
	public boolean verificarAdimplencia() {

		double somaSaldos = 0;
		for (Conta contaAtual: super.getContas()) {
			somaSaldos += contaAtual.getSaldo();
		}
		if (somaSaldos > -500) {
			super.setAdimplente(true);
			return super.isAdimplente();
		}else {
			super.setAdimplente(false);
			return super.isAdimplente();
		}	
	}
	//Getters e setters
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
