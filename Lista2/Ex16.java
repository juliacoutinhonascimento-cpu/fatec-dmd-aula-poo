import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = scan.nextInt();

        int n100 = valor / 100;
        valor = valor % 100;

        int n50 = valor / 50;
        valor = valor % 50;

        int n20 = valor / 20;
        valor = valor % 20;

        int n10 = valor / 10;
        valor = valor % 10;
       
        int n5 = valor / 5;
        valor = valor % 5;

        int n2 = valor / 2;
        valor = valor % 2;

        int n1 = valor / 1;
        valor = valor % 1;

        System.out.println("O número de notas de 100 é: " + n100);
        System.out.println("O número de notas de 50 é: " + n50);
        System.out.println("O número de notas de 20 é: " + n20);
        System.out.println("O número de notas de 10 é: " + n10);
        System.out.println("O número de notas de 5 é: " + n5);
        System.out.println("O número de notas de 2 é: " + n2);
        System.out.println("O número de notas de 1 é: " + n1);

        scan.close();

    }

}
