public class Pais {

    private String nome;
    private long populacao;
    private double dimensao;

    public Pais(String nome, long populacao, double dimensao){
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
        private Pais[] paises;
        private int quantidade;

        public Continente(String nome){
            this.nome = nome;
            this.paises = new Pais[48];
            this.quantidade = 0;
        }

        public boolean adicionarPais(Pais pais){
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

        public Pais getPaisMaiorPopulacao(){
            if(quantidade == 0) {
                return null;
            }

            Pais maior = paises[0];

            for(int i = 1; i < quantidade; i++){
                if (paises[i].getPopulacao() > maior.getPopulacao()){
                    maior = paises[i];
                }
            }

            return maior;
        }

        public Pais getPaisMenorPopulacao(){

            if (quantidade == 0){
                return null;
            }

            Pais menor = paises[0];

            for(int i = 1; i < quantidade; i++){
                if (paises[i].getPopulacao() < menor.getPopulacao()){
                    menor = paises[i];
                }
            }

            return menor;
        }

        public Pais getPaisMaiorDimensao(){
            if (quantidade == 0){
                return null;
            }

            Pais maior = paises[0];

            for (int i = 1; i < quantidade; i++){
                if (paises[i].getDimensao() > maior.getDimensao()){
                    maior = paises[i];
                }
            }
            return maior;
        }
        
        public Pais getPaisMenorDimensao(){
            if (quantidade == 0){
                return null;
            }

            Pais menor = paises[0];

            for (int i = 1; i < quantidade; i++){
                if (paises[i].getDimensao() < menor.getDimensao()){
                    menor = paises[i];
                }
            }
            return menor;
        }

        public double getRazaoTerritorial(){

            Pais maior = getPaisMaiorDimensao();
            Pais menor = getPaisMenorDimensao();

            if (maior == null || menor == null || menor.getDimensao() == 0){
                return 0;
            }

            return maior.getDimensao() / menor.getDimensao(); 
        }
    }
}
