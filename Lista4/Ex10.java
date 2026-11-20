import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++){
            valores[i] = scan.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                    repetido = true;
            }
            if (!repetido) {
                System.out.println(valores[i]);
            }

            if (!repetido){
                System.out.println(valores[i]);
            }
        }
        
        scan.close();
    }
}
