import java.util.Scanner;
public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[10];
    
        int contador = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor para a posição " + i + ": ");
            valores[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (valores[i] % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Quantidade de números pares: " + contador);
        scanner.close();
    }
}
