import java.util.Scanner;

public class CondicionaisEx5 {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero = sc.nextInt();

        if (numero >= 10 && numero <= 50) {
            System.out.println("O número está entre 10 e 50.");
        } else {
            System.out.println("O número não está entre 10 e 50.");

        }
    sc.close();
    }

}
