import java.util.Scanner;
public class Ex19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] valores = new int[3][3];
        boolean identidade = true;

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                valores[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                if (i == j && valores[i][j] != 1) identidade = false;
                if (i != j && valores[i][j] != 0) identidade = false;
            
            }
        }

        System.out.println(identidade);

        scan.close();
    }

}
