import java.util.Scanner;
public class Ex20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] valores = new int[3][3];

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                valores[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 3; i++){
            int soma =0;

            for(int j = 0; j < 3; j++){
                soma += valores[i][j];
            }

           System.out.println(soma);

        }

        scan.close();
    }

}
