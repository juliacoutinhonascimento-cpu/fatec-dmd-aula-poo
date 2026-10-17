package br.edu.sp.cps.fatec.barueri.dmd.aula7;

public class Pessoa {
	
	private String nome;
	private int cpf;
	private String corDoCabelo;
	
	public Pessoa(String n, int c) {
		
		nome = n;
		cpf = c;
		
	}
	
	public void setCorCabelo(String c) {
		
		corDoCabelo = c;
		
	}
	
	public 	String getCorDoCabelo() {
		
		return corDoCabelo;
		
	}
	
	public String getNome() {
		
		return nome;
	}

}
