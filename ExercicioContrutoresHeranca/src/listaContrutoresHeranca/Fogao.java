/**
 * 
 */
package listaContrutoresHeranca;

/**
 * @author tatianirodrigues
 *
 */
public class Fogao extends Eletrodomestico {
	
	private double numeroBocas;
	//Construtores
	public Fogao(String modelo, String fabricante,  double numeroBocas, double consumoKwDia) {
		super(modelo, fabricante,numeroBocas,  consumoKwDia);
	}
	
	public Fogao () {
		super();
	}

	// Getters and Setters 
	public double getNumeroBocas() {
		return numeroBocas;
	}

	public void setNumeroBocas(double numeroBocas) {
		this.numeroBocas = numeroBocas;
	}
	
}
