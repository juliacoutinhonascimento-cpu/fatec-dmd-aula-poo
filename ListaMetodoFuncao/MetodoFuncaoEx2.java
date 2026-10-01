public class MetodoFuncaoEx2 {

    public static int somar(int n1, int n2){
        return n1 + n2;
    }

    public static void monstrarResultado(int resultado){
        System.out.println("A soma dos números é: " + resultado);
    }

    public static void main(String[] args) {
        
    int resultado = somar(10, 20);
    monstrarResultado(resultado);
 }
}


