public class Ex8 {

    private String nome;
    private long populacao;
    private double dimensao;

    public Ex8(String nome, long populacao, double dimensao){
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getNome(){
        return nome;
    }

    public long getPopulacao(){
        return populacao;
    }

    public double getDimensao(){
        return dimensao;
    }

    public class Continente{

        private String nome;
        private Ex8[] paises;
        private int quantidade;

        public Continente(String nome){
            this.nome = nome;
            this.paises = new Ex8[48];
            this.quantidade = 0;
        }

        public String getNome(){
            return nome;
        }

        public boolean adicionarPais(Ex8 pais){
            if (quantidade < 48 && pais != null){

                paises[quantidade] = pais;
                quantidade++;
                return true;
            }
            return false;
        }

        public double getDimensaoTotal(){
            double total = 0;

            for(int i = 0; i < quantidade; i++){
                total += paises[i].getDimensao();
            }
            return total;
        }

        public long getPopulacaoTotal(){
            long total = 0;

            for(int i = 0; i < quantidade; i++){
                total += paises[i].getPopulacao();
            }
            return total;
        }

        public double getDensidadePopulacional(){
            double dimensao = getDimensaoTotal();

            if(dimensao==0){
                return 0;
            }
return(double) getPopulacaoTotal() / dimensao;
        }

        public Ex8 getPaisMaiorPopulacao(){
            if(quantidade == 0) {
                return null;
            }

            Ex8 maior = paises[0];

            for(int i = 1; i < quantidade; i++){
                if (paises[i].getPopulacao() > maior.getPopulacao()){
                    maior = paises[i];
                }
            }

            return maior;
        }

        public Ex8 getPaisMenorPopulacao(){

            if (quantidade == 0){
                return null;
            }

            Ex8 menor = paises[0];

            for(int i = 1; i < quantidade; i++){
                if (paises[i].getPopulacao() < menor.getPopulacao()){
                    menor = paises[i];
                }
            }

            return menor;
        }

        public Ex8 getPaisMaiorDimensao(){
            if (quantidade == 0){
                return null;
            }

            Ex8 maior = paises[0];

            for (int i = 1; i < quantidade; i++){
                if (paises[i].getDimensao() > maior.getDimensao()){
                    maior = paises[i];
                }
            }
            return maior;
        }
        
        public Ex8  getPaisMenorDimensao(){
            if (quantidade == 0){
                return null;
            }

            Ex8 menor = paises[0];

            for (int i = 1; i < quantidade; i++){
                if (paises[i].getDimensao() < menor.getDimensao()){
                    menor = paises[i];
                }
            }
            return menor;
        }

        public double getRazaoTerritorial(){

            Ex8 maior = getPaisMaiorDimensao();
            Ex8 menor = getPaisMenorDimensao();

            if (maior == null || menor == null || menor.getDimensao() == 0){
                return 0;
            }

            return maior.getDimensao() / menor.getDimensao(); 
        }
    }
}
