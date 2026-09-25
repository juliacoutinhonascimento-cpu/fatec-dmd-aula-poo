import java.util.Scanner;
public class LacosEx6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++){

        System.out.print("Digite o " + i + "° número : ");
        int numero = sc.nextInt();
            
        if (numero > maior){

            maior = numero;
        }

        System.out.println("O maior número digitado é: " + maior);
        
    }
sc.close();
}
}

