import java.util.Scanner;
public class LacosEx12 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao;
        int soma = 0;
        int subtracao = 0;

        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();
        
            do {
                System.out.println("Escolha a operação 1 - Soma | 2 - Subtração | 3 - Sair");
                opcao = sc.nextInt();

                if (opcao == 1){
                    soma = numero1 + numero2;
                    System.out.println("A soma dos números digitados é: " + soma);

                } else if (opcao == 2){
                    subtracao = numero1 - numero2;
                    System.out.println("A subtração dos números digitados é: " + subtracao);

                } else if (opcao == 3 ){
                    System.out.println("Saindo do programa...");

                } else {
                    System.out.println("Opção inválida, tente novamente.");
                
            } 
            
        } while (opcao != 3);

        sc.close();
        }
    }

