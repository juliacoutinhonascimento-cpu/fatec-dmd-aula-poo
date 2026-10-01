import java.util.Scanner;
public class MetodoFuncaoEx3 {

    public static int lerNumero(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        return sc.nextInt();
    }

    public static String ehPar(){

          if(lerNumero() % 2 == 0){
            return "é par";
          }else{
            return "é ímpar";
    }
}
    public static void mostrarResultado(String resultado){

        System.out.println("O número " + resultado);

    }

    public static void main(String[] args) {
        String resultado = ehPar();
        mostrarResultado(resultado);
    }



}
