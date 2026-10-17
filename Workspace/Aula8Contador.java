package br.edu.sp.cps.fatec.barueri.dmd.aula7;

public class Aula8Contador {

	public static void main(String[] args) {
		
		Contador c1 = new Contador();
		
		System.out.println(c1.valor());
		
		c1.incrementar();
		System.out.println(c1.valor());
		
		c1.incrementar();
		System.out.println(c1.valor());
		
		c1.decrementar();
		System.out.println(c1.valor());
		
		c1.zerar();
		System.out.println(c1.valor());
	}

}
