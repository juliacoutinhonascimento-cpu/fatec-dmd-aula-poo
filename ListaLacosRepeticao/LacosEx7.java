 import java.util.Scanner;
public class LacosEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posistivos = 0;
        int negativos = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° número: ");
            int numero = sc.nextInt();

            if (numero > 0){
                posistivos++;
            } else if (numero < 0){
                negativos++;
            }
        }
            System.out.println("Quantidade de números positivos: " + posistivos);
            System.out.println("Quantidade de números negativos: " + negativos);  
    sc.close();    
    
}
}