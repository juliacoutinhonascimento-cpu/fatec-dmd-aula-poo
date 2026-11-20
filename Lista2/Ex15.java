
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o peso em Kg: ");
        double peso = scan.nextDouble();

        System.out.println("Digite a altura em metros: ");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");

        } else if (imc < 25) {
            System.out.println("Você está com peso normal.");

        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso.");

        } else {
            System.out.println("Você está com obesidade.");
        }

        scan.close();
    }

}
