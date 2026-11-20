import java.util.Scanner;
public class Ex1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = sc.nextInt();

        if (numero > 0 ){
            System.out.println("Número Positivo");
        } else if(numero < 0 ){
            System.out.println("Número Negativo");
        } else {
            System.out.println("Número Igual a 0");
        }
        
     sc.close();
    }
}
