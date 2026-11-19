import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int x;
        boolean encontrado = false;

       
            for (int i = 0; i < 10; i++) {

                System.out.println("Digite um numero:");
                numeros[i] = entrada.nextInt();

            }

       
        System.out.println("Digite o valor X:");
            x = entrada.nextInt();

    
            for (int i = 0; i < 10; i++) {
                if (numeros[i] == x) {
                    encontrado = true;

                }
            }

        if (encontrado == true) {

            System.out.println("O valor esta presente no array.");
        
        } else {

            System.out.println("O valor nao esta presente no array.");
        }

        entrada.close();

}

}


