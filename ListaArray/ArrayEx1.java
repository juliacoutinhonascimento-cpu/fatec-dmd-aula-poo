
import java.util.Scanner;
public class ArrayEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3] + " " + numeros[4]);
        scanner.close();
    }

    }
