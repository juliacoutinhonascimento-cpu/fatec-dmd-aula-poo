import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scan.nextInt();

        }
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
        scan.close();

    }

}
