package br.edu.sp.cps.fatec.barueri.dmd.aula7;

public class Main {
 
	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		
		Gato g2 = new Gato("nome", 3, "Branco");

		g1.Miar();
		g2.Miar();
		
		System.out.println(g1.nome);
		
		g1.nome = "Abacatinho";
		System.out.println(g1.nome);
		g1.Miar();
		
		System.out.println(g2.nome);
		
		g1.VARIAVEL_GATO = "2";
		System.out.println(g1.VARIAVEL_GATO);
		System.out.println(g2.VARIAVEL_GATO);
		
	}

}

