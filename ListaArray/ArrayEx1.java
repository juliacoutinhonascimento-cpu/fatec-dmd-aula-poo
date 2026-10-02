
import java.util.scanner;
public class ArrayEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] v = new int[5];

            
                

             for (int i = 0; i < v.length; i++) {

                System.out.println("Digite um número inteiros:");
                v[i] = scanner.nextInt();
            }

           for (int i = 0; i < v.length; i++) {
            System.out.println("Valores do Array:" +v[i]);

            }

 scanner.close();
 }


}
