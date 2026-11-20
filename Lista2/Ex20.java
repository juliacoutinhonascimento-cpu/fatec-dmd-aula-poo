import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        int salario = scan.nextInt();

        double imposto;

        if (salario <= 2000){
            imposto = 0;

        }else if (salario <= 5000){
            imposto = salario * 0.10;

        }else{
            imposto = salario * 0.20;
        }

        System.out.println("Imposto: R$ " + imposto);
        
        scan.close();
    }
}
