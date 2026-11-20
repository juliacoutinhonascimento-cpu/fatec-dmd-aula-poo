import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int[][] valores = new int[3][3];
            int soma = 0;

            for (int i = 0; i < 3; i++){

                for(int j = 0; j < 3; j++){
                    valores[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 3; i++){
            soma += valores[i][i];
        }
        System.out.println("Soma final: " + soma);

        scan.close();
    }
}
