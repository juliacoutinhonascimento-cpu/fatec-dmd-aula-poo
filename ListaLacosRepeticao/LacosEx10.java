import java.util.Scanner;
public class LacosEx10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero = 0;

        do {
            System.out.println("Digite o número para somar (digite 0 para sair): ");
            numero = sc.nextInt();
            soma += numero;

        } while (numero != 0);{
            
            System.out.println("A soma dos números digitados é: " + soma);
        }
        sc.close();
    }

}
