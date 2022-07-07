/**
 * 
 */
package listaContrutoresHeranca;

/**
 * @author tatianirodrigues
 *
 */
public class LavaLouca extends Eletrodomestico {
	
	//Construtores
	public LavaLouca(String modelo, String fabricante,  double capacidadeEmLitros, double consumoKwDia) {
		super(modelo, fabricante,capacidadeEmLitros, consumoKwDia);
	}
	
	public LavaLouca () {
		super();
	}
}
