public class Ex9 {

    public static void mostrarMenu() {
        
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");

    }

    public static double depositar(double saldo, double valor) {
    
    return saldo + valor;
    }

    public static double sacar(double saldo, double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
    
        return saldo;

    }
    
    return saldo - valor;
 }

    public static void consultarSaldo(double saldo) {
        System.out.println("Saldo atual: R$ " + saldo);

    }

}
