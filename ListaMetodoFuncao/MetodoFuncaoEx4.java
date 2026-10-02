import java.util.Scanner;
public class MetodoFuncaoEx4 {

    public static double lerNota(){
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("Digite a nota: ");
            return scanner.nextDouble();      
      
    }
    
    public static double calcularMedia(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
    
    public static String verificarSituacao(Double media){
        if(media >= 6){
            return "aprovado";

        } else if(media >= 4 && media < 6){
            return "recuperação";

        } else {
            return "reprovado";

        }
    
    }

    public static void mostrarResultado(double media, String situacao){
      System.out.println("Média: " + media);
      System.out.println("Situação: " + situacao);
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = lerNota();
        double nota2 = lerNota();
        double nota3 = lerNota();
        double media = calcularMedia(nota1, nota2, nota3);
        String situacao = verificarSituacao(media);
        mostrarResultado(media, situacao); 
        
    scanner.close();
    }
  

}
