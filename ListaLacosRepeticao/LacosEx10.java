import java.util.Scanner;
public class LacosEx10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i != 0; i++){
            System.out.println("Digite o " + i + "° número: ");
            int numero = sc.nextInt();

            if (numero == 0){
                break;
            }
            
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
        sc.close();
    }

}
