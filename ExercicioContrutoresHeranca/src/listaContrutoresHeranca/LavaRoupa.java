/**
 * 
 */
package listaContrutoresHeranca;

/**
 * @author tatianirodrigues
 *
 */
public class LavaRoupa extends Eletrodomestico {
	
	private double capacidadeQuilos;
	
	//Construtores
	public LavaRoupa(String modelo, String fabricante,  double capacidadeQuilos, double consumoKwDia) {
		super(modelo, fabricante,capacidadeQuilos, consumoKwDia);
	}
	
	public LavaRoupa () {
		super();
	}

	// Getters and Setters 
	public double getCapacidadeQuilos() {
		return capacidadeQuilos;
	}

	public void setCapacidadeQuilos(double capacidadeQuilos) {
		this.capacidadeQuilos = capacidadeQuilos;
	}
	
	
}
