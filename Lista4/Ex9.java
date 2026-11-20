import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++){
            valores[i] = scan.nextInt();
        }

        for (int i = 0; i < valores.length - 1; i++){
            for (int j = 0; j < valores.length - 1; j++){

                if (valores[j] > valores[j + 1]) {
                    int temp = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = temp;
                }
        }
}

        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

        scan.close();
    }
}
