/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tatianirodrigues
 *
 */
public class Serra extends FerramentaEletrica{

	public Serra() {
		super();
	}

	public Serra(String modelo, String fabricante, double peso, double fatorDesgaste, double rotacao,
			int potencia, int tensao) {
		super(modelo, fabricante, peso, fatorDesgaste, rotacao, potencia, tensao);
	}
}
