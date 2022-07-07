/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tatianirodrigues
 *
 */
public class Martelo extends FerramentaAnalogica{

	public Martelo() {
		super();
	}
	public Martelo(String modelo, String fabricante, double peso, double fatorDesgaste, String tipo, double tamanho) {
		super(modelo, fabricante, peso, fatorDesgaste, tipo, tamanho);
	}

}
