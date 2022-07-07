/**
 * 
 */
package listaContrutoresHeranca;

/**
 * @author tatianirodrigues
 *
 */
public class Geladeira extends Eletrodomestico {
	
	//Construtores
	public Geladeira(String modelo, String fabricante,  double capacidadeEmLitros, double consumoKwDia) {
		super(modelo, fabricante,capacidadeEmLitros, consumoKwDia);
	}
	
	public Geladeira () {
		super();
	}
}
