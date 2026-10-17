package br.edu.sp.cps.fatec.barueri.dmd.aula7;

public class Contador {

	private int contagem;
	
	public 	Contador() {
		contagem = 1;
	}
	
	public Contador(int valorInicial) {
		contagem = valorInicial;
	}
	
	public void zerar() {
		contagem = 0;
	}
	
	public void incrementar() {
		contagem++;
	}
	
	public void decrementar() {
		contagem--;
	}
	
	public int valor() {
		
		return contagem;
		
	}
}
