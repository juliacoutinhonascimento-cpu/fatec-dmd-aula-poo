import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] valores = new int[3][3];

        for (int i = 0; i < 3; i++){
            
            for(int j = 0; i < 3; j++){
                valores[i][j] = scan.nextInt();
            }
        }

        scan.close();
    }
}
