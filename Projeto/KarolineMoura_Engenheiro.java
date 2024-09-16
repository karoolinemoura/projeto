public class KarolineMoura_Engenheiro extends KarolineMoura_Funcionario {
   private int nCedulaProfissional;
   public KarolineMoura_Engenheiro(String nome, int idade, int numeroFuncionario, int nCedulaProfissional) {
       super(nome, idade, numeroFuncionario);
       this.nCedulaProfissional = nCedulaProfissional;
   }
   public int getNCedulaProfissional() {
       return nCedulaProfissional;
   }
   public void setNCedulaProfissional(int nCedulaProfissional) {
       this.nCedulaProfissional = nCedulaProfissional;
   }
   @Override
   public void imprimeDados() {
       super.imprimeDados();
       System.out.println("Número da Cédula Profissional: " + nCedulaProfissional);
   }
   public void imprimeDados(KarolineMoura_Engenheiro eng) {
       eng.imprimeDados();
   }
}