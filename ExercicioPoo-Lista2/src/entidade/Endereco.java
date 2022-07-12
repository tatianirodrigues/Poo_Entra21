/**
 * 
 */
package entidade;

/**
 * @author tatianirodrigues
 *
 */
public class Endereco {
	private String cep;
	private String logradouro;
	private String estado;
	private String bairro;
	private String numeroCasa;
	private String cidade;
	
	
	//Construtores
	
	public Endereco(String cep, String logradouro, String estado, String bairro, String numeroCasa, String cidade) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.estado = estado;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
	}
	
	public Endereco() {
		super();
	}
	
	//Getters and Setters
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "CEP = " + cep + ", Logradouro = " + logradouro + ", Estado = " + estado + ", Bairro = " + bairro
				+ ", Numero da Casa = " + numeroCasa ;
	}

	
	
	
	
	
}
