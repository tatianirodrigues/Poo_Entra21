/**
 * 
 */
package entidade;

import java.util.ArrayList;

/**
 * @author tatianirodrigues
 *
 */
public abstract class Pessoa {
	
	private String nome;
	private boolean adimplente;
	private ArrayList <Conta> contas;
	

	//Construtores
	public Pessoa() {
		super();
		this.adimplente = true;
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		this.adimplente = true;
	}
	
	//Métodos
	public abstract boolean verificarAdimplencia(); 
	
	public double somaDosSaldos() {
		double somaSaldos = 0;
		for (Conta contaAtual: this.contas) {
			somaSaldos += contaAtual.getSaldo();
		}
		return somaSaldos;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAdimplente() {
		return adimplente;
	}

	public void setAdimplente(boolean adimplente) {
		this.adimplente = adimplente;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}

}
