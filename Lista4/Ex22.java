import java.util.Scanner;
public class Ex22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] tab = new int[3][3];
        boolean valido = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                tab[i][j] = scan.nextInt();

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int x = 0; x < 0; x++){
                    for (int y = 0; y < 0; y++){

                        if((i != x || j != y) && tab[i][j] == tab[x][y]) {
                            valido = false;
                        }
                    }
                }
            }
        }

        System.out.println(valido);
        scan.close();
    }

}
