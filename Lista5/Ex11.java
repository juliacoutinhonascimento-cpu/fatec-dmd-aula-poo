import java.util.Scanner;
import java.util.Random;
public class Ex11 {

    public static int sortearNumero(){
        Random random = new Random();
        return random.nextInt(100) + 1 ; // Gera um número aleatório entre 0 e 99
    }

    public static int lerPalpite(Scanner scanner){
        System.out.print("Digite seu palpite: ");
        return scanner.nextInt();
    }

    public static boolean verificarAcerto(int palpite, int numeroSecreto){
        return palpite == numeroSecreto;
    }

    public static void mostrarDica(int palpite, int numeroSecreto){
        if (palpite < numeroSecreto) {
            System.out.println("Tente um número maior!");
        } else {
            System.out.println("Tente um número menor!");
        }
    }

    public static void mostrarVitoria(int tentativas){
        System.out.println("Parabéns! Você acertou!" + tentativas + " tentativas.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = sortearNumero();
        int tentativas = 0;
        boolean acertou = false;

        while (!acertou) {
            int palpite = lerPalpite(scanner);
            tentativas++;

            if (verificarAcerto(palpite, numeroSecreto)) {
                mostrarVitoria(tentativas);
                acertou = true;

            } else {
                mostrarDica(palpite, numeroSecreto);
            }
        }

        scanner.close();
    }

}
