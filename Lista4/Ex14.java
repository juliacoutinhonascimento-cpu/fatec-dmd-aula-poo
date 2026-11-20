import java.util.Scanner;
public class Ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] valores = new int[4][4];
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                valores[i][j] = scan.nextInt();

                if (valores[i][j] > maior) {
                    maior = valores[i][j];
                }
            }
        }

        System.out.println("Maior valor: " + maior);

        scan.close();
    }
}
