import java.util.Scanner;
public class Ex18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao;

        do{
            System.out.print("\nMenu ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1: 
                    System.out.print("Digite o primeiro número: ");
                    int num1 = scan.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num2 = scan.nextInt();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    int num3 = scan.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num4 = scan.nextInt();
                    System.out.println("Resultado: " + (num3 - num4));
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            
        }
    } while (opcao != 3);

        scan.close();
    }

}


