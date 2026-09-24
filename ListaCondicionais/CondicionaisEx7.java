import java.util.Scanner;

public class CondicionaisEx7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        int media = (nota1 + nota2) / 2;

        System.out.println("A média é: " + media);

        if(media >= 6){
            System.out.println("Aprovado");

        } else if(media >= 4 && media < 6){
            System.out.println("Recuperação");

        } else {
            System.out.println("Reprovado");

        }
    sc.close();
    }
}
