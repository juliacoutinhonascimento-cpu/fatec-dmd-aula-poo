public class Pessoa {

    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa (String nome){
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public boolean equals(Pessoa outra){
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

    public boolean irmas(Pessoa outra){
        if(outra == null|| this.mae == null || outra.mae == null){
            return false;
        }

        return this.mae.equals(outra.mae);

    }
    
    public boolean antecessora(Pessoa outra){
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
