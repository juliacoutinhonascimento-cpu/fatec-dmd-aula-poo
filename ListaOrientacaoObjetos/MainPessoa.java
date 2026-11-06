public class MainPessoa {
public static void main(String[] args) {

        Pessoa avo = new Pessoa("Joao");
        Pessoa mae = new Pessoa("Ana", null, null);
        Pessoa pai = new Pessoa("Carlos", avo, null);

        Pessoa pedro = new Pessoa("Pedro", pai, mae);
        Pessoa maria = new Pessoa("Maria", pai, mae);

        Pessoa outroPedro = new Pessoa("Pedro", null, mae);

        System.out.println("Pedro e outroPedro sao iguais?");
        System.out.println(pedro.equals(outroPedro));

        System.out.println("Pedro e Maria sao irmaos?");
        System.out.println(pedro.irmas(maria));

        System.out.println("Carlos e antecessor de Pedro?");
        System.out.println(pedro.antecessora(pai));

        System.out.println("Joao e antecessor de Pedro?");
        System.out.println(pedro.antecessora(avo));

        System.out.println("Ana e antecessora de Pedro?");
        System.out.println(pedro.antecessora(mae));
    }

}
