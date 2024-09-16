public class KarolineMoura_Funcionario extends KarolineMoura_Pessoa {
   private int numeroFuncionario;
   public KarolineMoura_Funcionario(String nome, int idade, int numeroFuncionario) {
       super(nome, idade);
       this.numeroFuncionario = numeroFuncionario;
   }
   public int getNumeroFuncionario() {
       return numeroFuncionario;
   }
   public void setNumeroFuncionario(int numeroFuncionario) {
       this.numeroFuncionario = numeroFuncionario;
   }
   @Override
   public void imprimeDados() {
       super.imprimeDados();
       System.out.println("Número do Funcionário: " + numeroFuncionario);
   }
}