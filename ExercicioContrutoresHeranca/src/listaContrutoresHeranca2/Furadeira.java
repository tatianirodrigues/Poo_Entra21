/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tatianirodrigues
 *
 */
public class Furadeira extends FerramentaEletrica{

	//contrutores
	public Furadeira() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Furadeira(String modelo, String fabricante,double peso, double fatorDesgaste, double rotacao, int potencia, int tensao) {
		super(modelo, fabricante, peso, fatorDesgaste , rotacao, potencia, tensao);
		// TODO Auto-generated constructor stub
	}

}
