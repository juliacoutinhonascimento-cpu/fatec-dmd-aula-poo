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
