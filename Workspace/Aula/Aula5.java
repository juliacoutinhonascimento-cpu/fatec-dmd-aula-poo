
public class Aula5 {
	private static int soma(int[] p) {
		int soma = 0;
		for (int i = 0; i < p.length; i++) {
			soma += p[i];
	} 
		return soma;
	}

	private static void imprimir(int[] p) {
		System.out.print("[");
		for (int i = 0; i < p.length; i++) {
			p[i] = i + 5;
			System.out.print(p[i]);
			if(i < p.length - 1) {
				System.out.print(", ");
		}
		
	}
	System.out.println("]");	
}

	public static void main(String[] args) {
		int[]v;
		v = new int[6];
	
imprimir(v);
}
}
