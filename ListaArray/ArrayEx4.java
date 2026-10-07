import java.util.Scanner;
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int notas[] = new int[6];
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            
            System.out.print("Digite uma nota: ");
            notas[i] = scanner.nextInt();
            soma += notas[i];
        }

        double media = soma / 6;
        System.out.println(notas[0] + " " + notas[1] + " " + notas[2] + " " + notas[3] + " " + notas[4] + " " + notas[5]);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
