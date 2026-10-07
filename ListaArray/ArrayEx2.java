 import java.util.Scanner;
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] linha = new int [10];
        int soma = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            linha[i] = scanner.nextInt();
            soma += linha[i];
        }
        System.out.println("Soma: " + soma);
        scanner.close();
    }
}
