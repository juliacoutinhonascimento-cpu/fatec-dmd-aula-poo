import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[10];
        int count = 0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scan.nextInt();
        }

        int x = scan.nextInt();

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == x) count++;
            
            }
        }

        System.out.println(count);
        scan.close();
}

