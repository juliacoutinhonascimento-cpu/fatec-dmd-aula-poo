import java.util.Scanner;
public class CondicionaisEx14 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor dos lados do triângulo");
        System.out.print("Digite o valor do lado a: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor do lado b: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor do lado c: ");
        int c = sc.nextInt();

        if (a == b && b == c){
            System.out.println("O triângulo é equilátero.");

        } else if (a == b || a == c || b == c){
            System.out.println("O triângulo é isósceles.");
            
        } else {
            System.out.println("O triângulo é escaleno.");
        }
    sc.close();
    }

}
