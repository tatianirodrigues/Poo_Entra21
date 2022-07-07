/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tatianirodrigues
 *
 */
public class Alicate extends FerramentaAnalogica{

	public Alicate() {
		super();
	}
	public Alicate(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo, double tamanho) {
		super(modelo, fabricante, peso, fatorDesgaste, tipo, tamanho);
	}

}
