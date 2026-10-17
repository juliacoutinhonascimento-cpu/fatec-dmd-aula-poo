package br.edu.sp.cps.fatec.barueri.dmd.aula7;

public class Gato {
	
	static String VARIAVEL_GATO = "1";

	String nome;
	int quantidadePatas;
	String cor;

	public Gato() {
		// TODO Auto-generated constructor stub
	}

	public Gato(String n, int qtdPatas , String c) {
		
		nome = n;
		quantidadePatas = qtdPatas;
		cor = c;
	}
	
	public void Miar() {
		
			System.out.println(nome + "Miau");
	}
	
}
