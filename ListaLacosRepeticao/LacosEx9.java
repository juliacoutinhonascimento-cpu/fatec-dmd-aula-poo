import java.util.Scanner;
public class LacosEx9 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int resultado = 1;

        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();

        while(numero > 0){
            resultado = resultado * numero;
            numero--;
        }

        System.out.println("O fatorial do número digitado é: " + resultado);

sc.close();
    }
}
