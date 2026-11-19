import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];

        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        boolean achou = false;
        for (int valor : v) {
            if (valor == x) {
                achou = true;
                break;
            }
        }

        System.out.println(achou);
        sc.close();
    }
}



