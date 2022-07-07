/**
 * 
 */
package listaContrutoresHeranca2;

/**
 * @author tatianirodrigues
 * 
 *
 */
public class Ferramenta {

	private String modelo;
	private String fabricante;
	private double peso;
	private double fatorDesgaste;
	
	//Construtores
	public Ferramenta(String modelo, String fabricante, double peso, double fatorDesgaste) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
		this.fatorDesgaste = fatorDesgaste;
	}
	public Ferramenta() {
		super();
	}
	//Metodos
	public double calcularVidaUtilHoras() {
		double horas;
		horas = 100/fatorDesgaste;
		return horas;
	}
	public double calcularVidaUtil(String diaSemana) {
		double tempo = 0;
		if (diaSemana.equalsIgnoreCase("Dia")) {
			tempo = this.calcularVidaUtilHoras()/24;
		}
		else if (diaSemana.equalsIgnoreCase("Semana")){
			tempo = this.calcularVidaUtilHoras()/168;
		}
		return tempo;
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getFatorDesgaste() {
		return fatorDesgaste;
	}
	public void setFatorDesgaste(double fatorDesgaste) {
		this.fatorDesgaste = fatorDesgaste;
	}


}
