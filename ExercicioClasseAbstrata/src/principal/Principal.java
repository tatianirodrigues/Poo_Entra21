package principal;

import java.util.ArrayList;

import entidade.Conta;
import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

/**
 * @author tatianirodrigues
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String verificarAdimplente = "adimplente";
		
		ArrayList <Pessoa> pessoas =  new ArrayList();
		
		// Informações da Ana
		PessoaFisica ana = new PessoaFisica();
		pessoas.add(ana);
		ana.setNome("Ana Rodrigues");
		
		Conta contaAna1 = new Conta("1111", "011", -5200);
		
		ArrayList <Conta> contasAna =  new ArrayList();
		contasAna.add(contaAna1);
		
		ana.setContas(contasAna);
		
		
		// Informações do Julio
		PessoaFisica julio = new PessoaFisica();
		pessoas.add(julio);
		julio.setNome("Julio Souza");
		
		Conta contaJulio1 = new Conta("2222", "08", 100);
		Conta contaJulio2 = new Conta("1212", "08", 100);
		Conta contaJulio3 = new Conta("2121", "09", 200);
		
		ArrayList <Conta> contasJulio =  new ArrayList();
		contasJulio.add(contaJulio1);
		contasJulio.add(contaJulio2);
		contasJulio.add(contaJulio3);
		
		julio.setContas(contasJulio);
		
		// Informações da Uvas Da Ana
		PessoaJuridica uvasDaAna = new PessoaJuridica();
		pessoas.add(uvasDaAna);
		uvasDaAna.setNome("Uvas da Ana");
		
		Conta contaUvaAna1 = new Conta("333", "013", -600);
		
		ArrayList <Conta> contasUvaAna =  new ArrayList();
		contasUvaAna.add(contaUvaAna1);
		
		uvasDaAna.setContas(contasUvaAna);
		
		// Informações do Maças do Julio
		PessoaJuridica macasDoJulio = new PessoaJuridica();
		pessoas.add(macasDoJulio);
		macasDoJulio.setNome("Maças do Júlio");
		
		Conta contaMacaJulio1 = new Conta("4444", "014", 600);
		Conta contaMacaJulio2 = new Conta("4444", "014", -12600);
		
		ArrayList <Conta> contasMacaJulio =  new ArrayList();
		contasMacaJulio.add(contaMacaJulio1);
		contasMacaJulio.add(contaMacaJulio2);
		
		macasDoJulio.setContas(contasMacaJulio);
		
		//Saldos e adimplencias
			
		for (Pessoa pessoaAtual: pessoas) {
			if (pessoaAtual.verificarAdimplencia()) {
				verificarAdimplente = "adimplente";
			}else {
				verificarAdimplente = "inadimplente";
			}
			System.out.println(pessoaAtual.getNome() + " possui o saldo total de R$ " + pessoaAtual.somaDosSaldos() + " estando assim " + verificarAdimplente + ".");
			System.out.println("");
		}
	}

}