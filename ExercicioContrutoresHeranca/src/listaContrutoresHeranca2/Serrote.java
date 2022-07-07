/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tati
 *
 */
public class Serrote extends FerramentaAnalogica{
	
	private int quantidadeDentes;

	//Construtores
	public Serrote() {
		super();
	}
	public Serrote(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo, double tamanho, int quantidadeDentes) {
		super(modelo, fabricante, peso, fatorDesgaste, tipo, tamanho);
		this.quantidadeDentes = quantidadeDentes;
	}
	
	//Getters and Setters 
	public int getQuantidadeDentes() {
		return quantidadeDentes;
	}

	public void setQuantidadeDentes(int quantidadeDentes) {
		this.quantidadeDentes = quantidadeDentes;
	}

}
