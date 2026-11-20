import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Usuário: ");
        String usuario = scan.next();

        System.out.print("Senha: ");
        String senha = scan.next();

        if (!usuario.equals(usuarioCorreto) || !senha.equals(senhaCorreta)) {
            System.out.println("Login inválido!");

            scan.close();
            return;
        }

        double saldo = 1000.0;
        int opcao;

        do {
            System.out.println("\n===Menu===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1: 
                    System.out.println("Saldo: R$ " + saldo);
                    break;
                    
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    double deposito = scan.nextDouble();

                    if (deposito > 0){
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor do depósito inválido!");
                    }
                    break;

                    case 3: 
                        System.out.println("Digite o valor do saque: ");
                        double saque = scan.nextDouble();

                        if (saque <= 0){
                            System.out.println("Valor do saque inválido!");

                        }else if (saque > saldo){
                            System.out.println("Saldo insuficiente!");

                        }else{
                            saldo -= saque;
                            System.out.println("Saque realizado com sucesso!");

                        }
                        break;

                    case 4: 
                        System.out.println("Sistema Encerrado");
                        break;

                    default: 
                        System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scan.close();
   
        } 

        

}
