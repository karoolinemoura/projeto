public class KarolineMoura_Gerente extends KarolineMoura_Funcionario {
   private int equipe;
   // Getter e Setter
   public int getEquipe() {
       return equipe;
   }
   public void setEquipe(int equipe) {
       this.equipe = equipe;
   }
   @Override
   public void imprimeDados() {
       super.imprimeDados();
       System.out.println("Tamanho da Equipe: " + equipe);
   }
}
tem menu de contexto