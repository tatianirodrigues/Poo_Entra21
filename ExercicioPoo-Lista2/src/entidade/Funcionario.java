package entidade;

public class Funcionario {
		private String nome;
		private int idade;
		private double salarioBruto;
		private String cpf;
		private String dataAdmissaoEmpresa;
		
		//Construtor
		public Funcionario (double salarioBruto) {
			this.salarioBruto = salarioBruto;
		}
		
		//Metodos 
		public double getSalarioLiquido() {
			double salarioLiquido = this.salarioBruto * 0.94;
			return salarioLiquido;
		}
		
		//Getters and Setters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public double getSalarioBruto() {
			return salarioBruto;
		}
		public void setSalarioBruto(double salarioBruto) {
			this.salarioBruto = salarioBruto;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getDataAdmissaoEmpresa() {
			return dataAdmissaoEmpresa;
		}
		public void setDataAdmissaoEmpresa(String dataAdmissaoEmpresa) {
			this.dataAdmissaoEmpresa = dataAdmissaoEmpresa;
		}
}
