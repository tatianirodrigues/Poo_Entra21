/**
 * 
 */
package principal;

import java.util.ArrayList;

import entidade.ChefeDeSecao;
import entidade.Diretor;
import entidade.Endereco;
import entidade.Funcionario;
import entidade.Gerente;

/**
 * @author tati
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double somaSalarios = 0;
		int x=1;

		ArrayList <Funcionario> funcionarios =  new ArrayList();


		Funcionario funcionario1 = new Funcionario(2500);
		Funcionario funcionario2 = new Funcionario(2500);
		Funcionario funcionario3 = new Funcionario(2500);
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);

		ChefeDeSecao chefeDeSecao1 = new ChefeDeSecao(2000,100);
		ChefeDeSecao chefeDeSecao2 = new ChefeDeSecao(2500,300);
		funcionarios.add(chefeDeSecao1);
		funcionarios.add(chefeDeSecao2);

		Gerente gerente1 = new Gerente(4000,520);
		funcionarios.add(gerente1);
		gerente1.setNome("Ana Maria Silva");

		Diretor diretor1 = new Diretor(12000,"01/05/2007");
		diretor1.setDataAdmissaoEmpresa("01/05/2007");
		funcionarios.add(diretor1);

		System.out.println("\n******************************************* SALÁRIOS *******************************************");
		for(int i=0; i<funcionarios.size(); i++) {
			somaSalarios +=	funcionarios.get(i).getSalarioLiquido();
			if (i == 0 || i ==1 || i == 2) {
				System.out.println("Salário Líquido do Funcionário " + (i+1) + " : " + funcionarios.get(i).getSalarioLiquido());
			}
			if (i == 3 || i == 4) {
				System.out.println("Salário Líquido do Chefe de Seção " + x + " : "  + funcionarios.get(i).getSalarioLiquido());
				x++;
			}

		}

		System.out.println("Salário Líquido Gerente: " + gerente1.getSalarioLiquido());
		System.out.println("Salário Líquido Diretor: " + diretor1.getSalarioLiquido());
		System.out.println("Soma salários: "+ somaSalarios);

		System.out.println("\n******************************************* ENDEREÇOS *******************************************");

		Endereco enderecof1 = new Endereco("55555", "Serv Luis","SC","Ingleses","222", "Fpolis");
		funcionario1.setEndereco(enderecof1);
		funcionario2.setEndereco(enderecof1); //moram juntos
		Endereco enderecof3 = new Endereco("66666", "Rua Luz","SC","João Paulo","333", "Fpolis");
		funcionario3.setEndereco(enderecof3);

		Endereco enderecocs1 = new Endereco("22222", "Rua Sol","SC","Centro","444", "Fpolis");
		chefeDeSecao1.setEndereco(enderecocs1);
		Endereco enderecocs2 = new Endereco("22452", "Rua Mar","SC","Centro","8957", "Fpolis");
		chefeDeSecao2.setEndereco(enderecocs2);

		Endereco enderecog1 = new Endereco("66787", "Rua Sol","SC","Centro","1111", "Fpolis");
		gerente1.setEndereco(enderecog1);

		Endereco enderecod1 = new Endereco("99999", "Rua Praia","SC","Campeche","8686", "Fpolis");
		diretor1.setEndereco(enderecod1);

		gerente1.getEndereco().setBairro("Agronomica"); //mudou de endereço
		
		x=1;
		for(int i=0; i<funcionarios.size(); i++) {
			if (i == 0 || i ==1 || i == 2) {
				System.out.println("O Endereço do Funcionário " + (i+1) + ": " + funcionarios.get(i).getEndereco());
			}
			if (i == 3 || i == 4) {

				System.out.println("O Endereço do Chefe de Seção " + (x) + ": "  + funcionarios.get(i).getEndereco());
				x++;
			}
		}
		System.out.println("O Endereço do Gerente: " + gerente1.getEndereco());
		System.out.println("O Endereço do Diretor: " + diretor1.getEndereco());
	}
}