/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tatianirodrigues
 *
 */
public class FerramentaAnalogica extends Ferramenta{

	private String tipo;
	private double tamanho;
	
	//Construtores
	public FerramentaAnalogica(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo, double tamanho) {
		super(modelo, fabricante, peso, fatorDesgaste);
		this.tipo = tipo;
		this.tamanho = tamanho;
	}
	public FerramentaAnalogica() {
		super();
	}
	
	//Getters and Setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/** JAVADOC. - O valor do Martelo esta em Milimetros, o do Alicate e do Serrote em Polegadas**/
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
	
}
