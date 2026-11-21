import java.util.Scanner;
import java.util.Random;
public class Ex12 {

    public static void mostrarMenu(){
        System.out.print("1 - Pedra\n2 - Papel\n3 - Tesoura\n");
    }

    public static int jogadaComputador(){
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static int jogadaUsuario(Scanner scanner){
        System.out.print("Digite sua jogada: ");
        return scanner.nextInt();
    }

    public static String converterJogada(int jogada){
        if (jogada == 1) {
            return "Pedra";
        } else if (jogada == 2) {
            return "Papel";
        } else if (jogada == 3) {
            return "Tesoura";
        } else {
            return "Jogada inválida";
        }
    }

    public static String verificarVencedor(int jogadaUsuario, int jogadaComputador){
        if (jogadaUsuario == jogadaComputador) {
            return "Empate";
        } else if ((jogadaUsuario == 1 && jogadaComputador == 3) ||
                   (jogadaUsuario == 2 && jogadaComputador == 1) ||
                   (jogadaUsuario == 3 && jogadaComputador == 2)){

            return "Você venceu";

        } else {
            return "Computador venceu";
        }
    }

    public static void mostrarResultado(int jogadaUsuario, int jogadaComputador, String resultado){
        System.out.println("Sua jogada: " + converterJogada(jogadaUsuario));
        System.out.println("Jogada do computador: " + converterJogada(jogadaComputador));
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        mostrarMenu();

        int jogadaUsuario = jogadaUsuario(scanner);
        int jogadaComputador = jogadaComputador();
        
        String resultado = verificarVencedor(jogadaUsuario, jogadaComputador);
        
        mostrarResultado(jogadaUsuario, jogadaComputador, resultado);

        scanner.close();
    }
}
