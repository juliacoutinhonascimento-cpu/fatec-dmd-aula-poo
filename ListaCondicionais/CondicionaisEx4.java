import java.util.Scanner;

public class CondicionaisEx4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O número: " + num1 + " é maior.");
        } else if (num1 < num2) {
            System.out.println("O número: " + num2 + " é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }

     sc.close();
    }

}
