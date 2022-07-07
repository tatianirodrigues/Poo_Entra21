/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tatianirodrigues
 *
 */
public class Lixadeira extends FerramentaEletrica{

	public Lixadeira() {
		super();
	}

	public Lixadeira(String modelo, String fabricante, double peso, double fatorDesgaste, double rotacao,
			int potencia, int tensao) {
		super(modelo, fabricante, peso, fatorDesgaste, rotacao, potencia, tensao);
	}
}
