/**
 * 
 */
package listaContrutoresHeranca;

/**
 * @author tatianirodrigues
 *
 */
public class Eletrodomestico {
	
	private String modelo;
	private String fabricante;
	private double capacidadeEmLitros;
	private double consumoKwDia;
	
	
	//Construtores
		public Eletrodomestico(String modelo, String fabricante,  double capacidadeEmLitros, double consumoKwDia) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.capacidadeEmLitros = capacidadeEmLitros;
		this.consumoKwDia = consumoKwDia;
	}
	
	public Eletrodomestico () {
		
	}
	//Metodo
	public double calculoConsumoMes() {
		return this.consumoKwDia * 30;
	}
	public double calculoConsumoDia( int dias) {
		return this.consumoKwDia * dias;
	}
	
	
	//Getters and Setters
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getCapacidadeEmLitros() {
		return capacidadeEmLitros;
	}
	
	public void setCapacidadeEmLitros(double capacidadeEmLitros) {
		this.capacidadeEmLitros = capacidadeEmLitros;
	}

	public double getConsumoKwDia() {
		return consumoKwDia;
	}

	public void setConsumoKwDia(double consumoKwDia) {
		this.consumoKwDia = consumoKwDia;
	}
	
}

