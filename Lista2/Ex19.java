import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scan.nextDouble();

        if (temperatura < 0){
            System.out.println("Frio");

        }else if (temperatura <= 25){
            System.out.println("Agradável");

        }else if (temperatura > 25 && temperatura <= 35){
            System.out.println("Quente");

        }else{
            System.out.println("Apcalípse Climatico");
        }
        scan.close();
    }
}
