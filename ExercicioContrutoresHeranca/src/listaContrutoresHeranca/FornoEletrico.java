/**
 * 
 */
package listaContrutoresHeranca;

/**
 * @author tatianirodrigues
 *
 */
public class FornoEletrico extends Eletrodomestico {

	@Override
	public double calculoConsumoMes() {
		double desperdicioEletrico = super.getConsumoKwDia() * 0.25 * 30;
		double consumoMes = super.getConsumoKwDia() * 30;
		return desperdicioEletrico + consumoMes;
	}
	public double calculoConsumoDia( int dias) {
		double desperdicioEletrico = super.getConsumoKwDia() * 0.25 * dias;
		double consumoMes = super.getConsumoKwDia() * dias;
		return desperdicioEletrico + consumoMes;
	}

	
	//Construtores
	public FornoEletrico(String modelo, String fabricante,  double capacidadeEmLitros, double consumoKwDia) {
		super(modelo, fabricante,capacidadeEmLitros, consumoKwDia);
	}

	public FornoEletrico () {
		super();
	}


}
