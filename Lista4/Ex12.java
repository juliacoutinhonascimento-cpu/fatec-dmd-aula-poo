import java.util.Scanner;
public class Ex12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] valores = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){
                valores[i][j] = scan.nextInt();
                soma += valores[i][j];

            }
        }
        System.out.println("Soma final: " + soma);

        scan.close();
    }
}
