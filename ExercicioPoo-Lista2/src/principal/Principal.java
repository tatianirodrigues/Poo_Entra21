/**
 * 
 */
package principal;

import java.util.ArrayList;

import entidade.ChefeDeSecao;
import entidade.Diretor;
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
		// TODO Auto-generated method stub
double somaSalarios = 0;
		
		ArrayList <Funcionario> funcionarios =  new ArrayList();
		
	
		Funcionario funcionario1 = new Funcionario(2500);
		Funcionario funcionario2 = new Funcionario(2500);
		Funcionario funcionario3 = new Funcionario(2500);
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
	
		ChefeDeSecao chefeDeSecao1 = new ChefeDeSecao(2500, 300);
		ChefeDeSecao chefeDeSecao2 = new ChefeDeSecao(2500, 300);
		funcionarios.add(chefeDeSecao1);
		funcionarios.add(chefeDeSecao2);
		
		Gerente gerente1 = new Gerente(4000,520);
		funcionarios.add(gerente1);
		
		Diretor diretor1 = new Diretor(12000,"01/05/2007");
		diretor1.setDataAdmissaoEmpresa("01/05/2007");
		funcionarios.add(diretor1);
		
		
		for(int i=0; i<funcionarios.size(); i++) {
			somaSalarios +=	funcionarios.get(i).getSalarioLiquido();
			if (i == 0 || i ==1 || i == 2) {
			System.out.println("Salário Líquido do Funcionário " + (i+1) + " é " + funcionarios.get(i).getSalarioLiquido());
			}
			if (i == 3 || i == 4) {
			System.out.println("Salário Líquido do Chefe de Seção " + (i+1) + " é "  + funcionarios.get(i).getSalarioLiquido());
			}
		}
		System.out.println("Salário Líquido Gerente: " + gerente1.getSalarioLiquido());
		System.out.println("Salário Líquido Diretor: " + diretor1.getSalarioLiquido());
		System.out.println("Soma salários: "+ somaSalarios);
	}

}
