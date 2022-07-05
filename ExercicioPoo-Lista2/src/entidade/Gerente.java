package entidade;

public class Gerente extends Funcionario {

	private double comissao;
	
	//Construtor
	public Gerente (double salarioBruto, double comissao) {
		super(salarioBruto);
		this.comissao = comissao;
	}
	
	//Métodos
	@Override
	public double getSalarioLiquido() {
		
		return super.getSalarioLiquido() + this.comissao;
	}
	
	//Getters and Setters
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
