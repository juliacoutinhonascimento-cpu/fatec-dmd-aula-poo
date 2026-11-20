public class Ex9 {

    private String nome;
    private Ex9 pai;
    private Ex9 mae;

    public Ex9(String nome, Ex9 pai, Ex9 mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Ex9 (String nome){
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public boolean equals(Ex9 outra){
        if (outra == null){
            return false;
        }

        if (this.mae == null && outra.mae == null){
            return true;
        }

        if (this.mae!= null && outra.mae != null){
            return this.mae.equals(outra.mae.nome);
        }
    return false;
    }

    public boolean irmas(Ex9 outra){
        if(outra == null|| this.mae == null || outra.mae == null){
            return false;
        }

        return this.mae.equals(outra.mae);

    }
    
    public boolean antecessora(Ex9 outra){
    if (outra == null){
        return false;

    }
    if (this.pai != null && this.pai.equals(outra)){
        return true;
    }
    if (this.mae != null && this.mae.equals(outra)){
        return true;
    }

    return false;
}
}

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
