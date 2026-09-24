import java.util.Scanner;
public class LacosEx5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para fazer a tabuada: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++){

            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
