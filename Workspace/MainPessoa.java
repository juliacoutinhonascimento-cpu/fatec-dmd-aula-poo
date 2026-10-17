package br.edu.sp.cps.fatec.barueri.dmd.aula7;

public class MainPessoa {
	
	public static void main(String[] args) {
		
		Pessoa andriely = new Pessoa("Andy", 1344564563);
		
		System.out.println(andriely.getCorDoCabelo());
		
		System.out.println(andriely.getNome());
		
		andriely.setCorCabelo("Ruivo");
		System.out.println(andriely.getCorDoCabelo());
	}

}
