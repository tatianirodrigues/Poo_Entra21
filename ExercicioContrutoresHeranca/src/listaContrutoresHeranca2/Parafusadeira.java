/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tatianirodrigues
 *
 */
public class Parafusadeira extends FerramentaEletrica{

	public Parafusadeira() {
		super();
	}

	public Parafusadeira(String modelo, String fabricante, double peso, double fatorDesgaste, double rotacao,
			int potencia, int tensao) {
		super(modelo, fabricante, peso, fatorDesgaste, rotacao, potencia, tensao);
	}
}
