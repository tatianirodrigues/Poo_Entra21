package entidade;

public class ChefeDeSecao extends Funcionario {
	 
	private double adicional;
	
	//Construtor
	public ChefeDeSecao (double salarioBruto, double adicional) {
		super(salarioBruto);
		this.adicional = adicional;
	}
	
	@Override
	public double getSalarioLiquido() {
		return super.getSalarioLiquido() + adicional;
	}
}
