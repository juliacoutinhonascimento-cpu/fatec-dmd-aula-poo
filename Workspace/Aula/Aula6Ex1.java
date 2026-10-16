
public class Aula6Ex1 {
	
	public static void main(String[] args) {
		
		int[]v = {1,2,3,5,7};
		int soma = soma(v);
		System.out.println(soma);
		
}
	private static int soma(int[]valores) {
		int soma = 0;
		
		for(int i = 0; i < valores.length; i++) {
			
			if(i == 2) {
				return soma;
			}
			
			soma += valores[i];
		}
		
		return soma;
		
	}
}
