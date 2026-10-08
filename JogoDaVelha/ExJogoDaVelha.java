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

    for(int linha = 0; linha < 3; linha++){
       
        System.out.print((linha + 1) + "|");

}
    for(int coluna = 0; coluna < 3; coluna++){

        System.out.print(tabuleiro[linha][coluna] + "|" );
 }

 public static void realizarJogada(char jogador){

    int linha;
    int coluna;

    while(true){
        System.out.println("Jogador" + jogador + ", digite a linha (1 - 3): ");

        

    }
 }



    


}
}
