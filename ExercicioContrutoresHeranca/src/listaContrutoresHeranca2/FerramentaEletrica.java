/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tatianirodrigues
 *
 */
public class FerramentaEletrica extends Ferramenta {

	private double rotacao;
	private int potencia;
	private int tensao;
	
	//Construtores
	public FerramentaEletrica(String modelo, String fabricante, double peso, double fatorDesgaste, double rotacao, int potencia, int tensao) {
		super(modelo, fabricante, peso, fatorDesgaste);
		this.rotacao = rotacao;
		this.potencia = potencia;
		this.tensao = tensao;
	}
	public FerramentaEletrica() {
		super();
	}

	//Getters and setters
	public double getRotacao() {
		return rotacao;
	}
	public void setRotacao(double rotacao) {
		this.rotacao = rotacao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	
}
