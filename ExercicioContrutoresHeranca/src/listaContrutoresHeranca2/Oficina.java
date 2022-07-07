/**
 * 
 */
package listaContrutoresHeranca2;

import java.util.ArrayList;

/**
 * @author tati
 *
 */
public class Oficina {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		– DESENVOLVA UMA CLASSE OFICINA ONDE ELA SERÁ EQUIPADA POR UMA FURADEIRA, UMA LIXADEIRA, UMA
//		SERRA, DOIS ALICATES, DOIS MARTELOS E UM SERROTE. DESEJA-SE SABER QUAL SERÁ O CONSUMO ELÉTRICO
//		TOTAL (WATTS/HORA) DAS FERRAMENTAS DESTA OFICINA POR MÊS E POR SEMANA, SABENDO QUE CADA
//		FURADEIRA TRABALHA 3 HORAS POR DIA, A LIXADEIRA 2 HORAS E A SERRA 4 HORAS. TAMBÉM DESEJA-SE SABER
//		QUAL FERRAMENTA MANUAL POSSUI O MAIOR TEMPO DE VIDA ÚTIL.
				
		ArrayList<Ferramenta> ferramentas = new ArrayList();
		
		Furadeira furadeira = new Furadeira("ffff", "ff", 0.5, 0.1, 3000, 600, 220);
		ferramentas.add(furadeira);
		Lixadeira lixadeira = new Lixadeira ("SA7021", "lll", 4.7, 0.002, 6600, 2200, 220);
		ferramentas.add(lixadeira);
		Serra serra = new Serra ("ssss", "ss1ss", 6, 1, 8000, 3000, 110);
		ferramentas.add(serra);
		Alicate alicate1 = new Alicate ("aaa1", "aa1a" , 0.2, 0.003, "Universal", 5);
		ferramentas.add(alicate1);
		Alicate alicate2 = new Alicate("aaa2", "aa2a" , 0.2, 0.03, "Universal", 5);
		ferramentas.add(alicate2);
		Martelo martelo1 = new Martelo("mmm1","m1m", 0.1, 0.004, "BOLA,", 15);
		ferramentas.add(martelo1);
		Martelo martelo2 = new Martelo("mmm2","m2m", 0.3, 0.006, "BOLA,", 15);
		ferramentas.add(martelo2);
		Serrote serrote = new Serrote ("1sss","s1s", 1, 6, "BOLA,", 20, 10);
		ferramentas.add(serrote);
		
		double maiorFatorDesgaste = -1;
		String modeloMaiorDesgaste = "xxx";
		
		double menorFatorDesgaste = 100;
		String modeloMenorDesgaste = "zzz";
		
		for (int i = 0; i < ferramentas.size(); i++) {
		
			double fatorDesgaste = ferramentas.get(i).getFatorDesgaste();
			
			if(fatorDesgaste > maiorFatorDesgaste) {
				 maiorFatorDesgaste = fatorDesgaste;
				 modeloMaiorDesgaste = ferramentas.get(i).getModelo();
			 }
			else if (fatorDesgaste < menorFatorDesgaste) {
				menorFatorDesgaste = fatorDesgaste;
				modeloMenorDesgaste = ferramentas.get(i).getModelo();
			}
			
		}
		double consumoDiaFuradira = furadeira.getPotencia() * 3;
		double consumoDiaLixadeira = lixadeira.getPotencia() * 2;
		double consumoDiaSerra = serra.getPotencia() * 4;
		
		double somaConsumo = consumoDiaFuradira + consumoDiaSerra + consumoDiaLixadeira;
		double consumoDia = (somaConsumo / 24);
		
		System.out.println("************* CONSUMO SEMANAL *************");
		System.out.println("Em uma semana a Oficina consome " + (consumoDia * 7) + " Watts/Hora");
		System.out.println("\n************* CONSUMO MENSAL *************");
		System.out.println("Em um mes de 30 dias a Oficina consome " + (consumoDia * 30) + " Watts/Hora");
		System.out.println("\n************* FATOR DESGASTE *************");
		System.out.println(modeloMaiorDesgaste + " tem o Fator Desgaste de " +maiorFatorDesgaste + " %/hora, sendo essa a ferramenta com a menor vida util.");
		System.out.println(modeloMenorDesgaste + " tem o Fator Desgaste de " +menorFatorDesgaste + " %/hora, sendo essa a ferramenta com a maior vida util.");	
	}

}
