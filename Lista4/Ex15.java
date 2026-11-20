import java.util.Scanner;   
public class Ex15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] valores = new int[3][3];
        int pares = 0;

        for (int i = 0; i < 3; i++){
            
            for(int j = 0; j < 3; j++){
                valores[i][j] = scan.nextInt();

                if (valores[i][j] % 2 == 0) pares++;
                
            }
        }

        System.out.println("Quantidade de valores pares: " + pares);
        scan.close();
    }

}
