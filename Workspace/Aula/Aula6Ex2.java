import java.util.Arrays;

public class Aula6Ex2 {
public static void main(String[] args) {
		
		int[][]sala = {
						   {1, 0, 0, 1, 1, 0},
						   {1, 1, 0, 0, 0, 0},
						   {1, 0, 1, 0, 0, 0},
						   {1, 0, 0, 0, 0, 0},
						   {0, 1, 0, 0, 0, 0},
						   {0, 1, 1, 1, 1, 1},
						   {1, 0, 1, 0, 1, 1}};
		
		System.out.println(soma(sala));
		
}
	private static int soma(int[][]m) {
		int soma = 0;
		
		for(int i = 0; i < m.length; i++) {
			
			System.out.println(Arrays.toString(m[i]));
			
			for(int j = 0; j < m.length; j++) {
				
					soma = m[i][j];
			}
		}
		
		return soma;
		
	}

}
