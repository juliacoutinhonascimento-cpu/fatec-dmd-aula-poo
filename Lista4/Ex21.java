import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                
                System.out.print(tabuleiro[i][j] + " ");
            }

            System.out.println();
        }
        scan.close();
    }

}
