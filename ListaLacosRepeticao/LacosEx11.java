import java.util.Scanner;
public class LacosEx11 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        do {
            System.out.println("Digite um número entre 1 e 10:");
                numero = sc.nextInt();

                if (numero < 1 || numero > 10){
                    System.out.println("Número inválido: " + numero);
                }

        } while (numero >= 1 && numero <= 10);

    sc.close();
    }

}
