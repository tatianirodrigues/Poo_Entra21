/**
 * 
 */
package listaContrutoresHeranca;

/**
 * @author tati
 *
 */
public class Microondas extends Eletrodomestico {

	//Construtores
	public Microondas(String modelo, String fabricante,  double capacidadeEmLitros, double consumoKwDia) {
		super(modelo, fabricante,capacidadeEmLitros, consumoKwDia);
	}
	
	public Microondas () {
		super();
	}
}

