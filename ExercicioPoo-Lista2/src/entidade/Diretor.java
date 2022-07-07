package entidade;

public class Diretor extends Funcionario{
	
	//Construtor
	public Diretor (double salarioBruto, String dataAdmissaoEmpresa) { 
		super(salarioBruto);
		super.setDataAdmissaoEmpresa(dataAdmissaoEmpresa);
	}
	
	//Métodos
	@Override
	public double getSalarioLiquido() {
		int anosDeEmpresa = this.calcularAnosDeServico(); 
		double comissao = super.getSalarioLiquido() * (anosDeEmpresa/3 * 0.05);		
		double salario = super.getSalarioLiquido() + comissao;
		return salario;
	}
	
	public int calcularAnosDeServico() {
		int anosDeEmpresa;
		
		//Assumir dd/mm/yyyy
		String anoAdimissao= super.getDataAdmissaoEmpresa().substring(6);
		anosDeEmpresa = 2022 - Integer.valueOf(anoAdimissao);
		
		return anosDeEmpresa;
	}
}
