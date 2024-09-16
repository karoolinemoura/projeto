public class Main {
   public static void main(String[] args) {
       KarolineMoura_Engenheiro engenheiro = new KarolineMoura_Engenheiro("João", 30, 12345, 67890);
       engenheiro.imprimeDados();
       System.out.println("\nUsando o método polimórfico:");
       engenheiro.imprimeDados(engenheiro);
   }
}