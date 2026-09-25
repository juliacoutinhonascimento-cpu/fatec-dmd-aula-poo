import java.util.Scanner;
public class CondicionaisEx13 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){

        System.out.println("O ano " + ano + " é bissexto.");

        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        
sc.close();
    }

}
