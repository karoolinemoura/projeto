public class KarolineMoura_Secretario extends KarolineMoura_Funcionario {
   private String chefeDireto;
   // Getter e Setter
   public String getChefeDireto() {
       return chefeDireto;
   }
   public void setChefeDireto(String chefeDireto) {
       this.chefeDireto = chefeDireto;
   }
   @Override
   public void imprimeDados() {
       super.imprimeDados();
       System.out.println("Chefe Direto: " + chefeDireto);
   }
}