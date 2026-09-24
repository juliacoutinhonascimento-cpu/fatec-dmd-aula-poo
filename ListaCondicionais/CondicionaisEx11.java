import java.util.Scanner;
public class CondicionaisEx11 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Escolha uma operação ( + , - , * , / ): ");
        String operacao = sc.next();

        switch (operacao) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
        case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
       case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
        case "/":
                System.out.println("Resultado: " + (num1 / num2));
                break;

        default:
                System.out.println("Operação inválida");

        }
    sc.close();
    }
    
}
