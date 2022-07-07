/**
 * 
 */
package listaContrutoresHeranca;

import java.util.ArrayList;

/**
 * @author tatianirodrigues
 *
 */
public class Cozinha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		
//		DESENVOLVA UMA CLASSE COZINHA (EXECUTÁVEL), ONDE A MESMA SERÁ EQUIPADA POR UMA GELADEIRA,
//		UM FOGÃO, UMA LAVADORA DE LOUÇA E UM MICRO-ONDAS. DESEJA-SE SABER QUAL SERÁ O CONSUMO DESTA
//		COZINHA NO MÊS E QUAL O CONSUMO EM 10 DIAS.
		double soma = 0;
		
		ArrayList <Eletrodomestico> eletrodomesticos = new ArrayList();
				
		Geladeira geladeira = new Geladeira ("gggg","ggg",10,10);
		eletrodomesticos.add(geladeira);
		Fogao fogao = new Fogao("ffff","fff",20,20);
		eletrodomesticos.add(fogao);
		LavaLouca lavaLouca = new LavaLouca("llll","lll",30,30);
		eletrodomesticos.add(lavaLouca);
		Microondas microondas = new Microondas("mmmm","mmm",40,40);
		eletrodomesticos.add(microondas);
		FornoEletrico fornoEletrico = new FornoEletrico("fefe","fee",10,10);
		eletrodomesticos.add(fornoEletrico);

		System.out.println("***** Consumo Cozinha em 30 dias *****");
		for (int i = 0; i<eletrodomesticos.size(); i ++) {
			double consumo = eletrodomesticos.get(i).calculoConsumoMes();
			soma += consumo;
			System.out.println("Consumo do eletrodomestico " + eletrodomesticos.get(i).getModelo() + ": " + eletrodomesticos.get(i).calculoConsumoMes() + "Kw");
		}
		System.out.println("Soma do consumo da Cozinha: " + soma + "Kw");
		System.out.println("\n***** Consumo Cozinha em 10 dias *****");
		soma = 0;
		for (int i = 0; i<eletrodomesticos.size(); i ++) {
			double consumo = eletrodomesticos.get(i).calculoConsumoDia(10);
			soma += consumo;
			System.out.println("Consumo do eletrodomestico " + eletrodomesticos.get(i).getModelo() + ": " + eletrodomesticos.get(i).calculoConsumoDia(10) + "Kw");
		}
		System.out.println("Soma do consumo da Cozinha: " + soma + "Kw");
	}

}
