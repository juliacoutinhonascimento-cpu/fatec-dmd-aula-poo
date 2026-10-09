import java.util.Scanner;

public class ExJogoDaVelha {
   static Scanner entrada = new Scanner(System.in);

    static char[][] tabuleiro = new char[3][3];


public static void iniciarTabuleiro(){

    for (int linha = 0; linha < 3; linha++){

        for (int coluna = 0; coluna < 3; coluna++){

            tabuleiro[linha][coluna] = ' ';
        }
    }
}

public static void exibirTabuleiro(){

    System.out.println();
    System.out.println("  1 2 3");
    System.out.println(" +--+--+--+");

    for (int linha = 0; linha < 3; linha++) {
        System.out.print((linha + 1) + "|");

        for (int coluna = 0; coluna < 3; coluna++) {
            System.out.print(tabuleiro[linha][coluna] + "|");
        }

        System.out.println();
    }
}

 public static void realizarJogada(char jogador){

    int linha;
    int coluna;

    while(true){

        System.out.println("Jogador" + jogador + ", informe a linha: ");
        linha = entrada.nextInt();

        System.out.println("Jogador" + jogador + ", informe a coluna: ");
        coluna = entrada.nextInt();

    if(!posicaoValida(linha, coluna)){

        System.out.println("Posição inválida! Digite valores entre 1 e 3.");
        continue;
    }
        if(tabuleiro[linha - 1][coluna - 1] != ' '){

            System.out.println("Posição já ocupada! Escolha outra posição.");
            continue;
        }
    

        tabuleiro[linha - 1][coluna - 1] = jogador;

        break;
    }
    

    public static boolean posicaoValida(int linha, int coluna){

        return linha >= 1 && linha <= 3 && coluna >= 1 && coluna <= 3;

    }

    public static boolean verificarVitoria(char jogador){

        for (int linha = 0; linha < 3; linha++){

            if (tabuleiro[linha][0] == jogador && tabuleiro[linha][1] == jogador && tabuleiro[linha][2] == jogador){
                jogador = 'x';
                return true;
            }
        }

        for (int coluna = 0; coluna < 3; coluna++){
            
         if (tabuleiro[0][coluna] == jogador && tabuleiro[1][coluna] == jogador && tabuleiro[2][coluna] == jogador){
                jogador = 'x';
                return true;
            }

         if(tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador){
                jogador = 'x';
                return true;
            }
            
            return false;

        }

    
  }
}
