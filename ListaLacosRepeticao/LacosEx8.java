import java.util.Scanner;
public class LacosEx8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;

        System.out.println("Quantos valores você deseja enviar? ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o " + i + "° valor: ");
            int valor = sc.nextInt();
            media += valor;
        }

        media /= quantidade;
        System.out.println("A média dos valores é: " + media);
       
    sc.close();
    }

}
