import java.util.Scanner;
public class CondicionaisEx10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra para o desconto: ");
        double vlrcompra = sc.nextDouble();

        if (vlrcompra >= 100){
            double desconto = vlrcompra - vlrcompra * 0.1;
            System.out.println("Você recebeu 10% de desconto: R$" + desconto);

        } else {
            System.out.println("Valor não elegível para desconto: R$" + vlrcompra);
        }
    sc.close();
    }

}
