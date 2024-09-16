public class KarolineMoura_Diretor extends KarolineMoura_Funcionario {
   private String departamento;
   // Getter e Setter
   public String getDepartamento() {
       return departamento;
   }
   public void setDepartamento(String departamento) {
       this.departamento = departamento;
   }
   @Override
   public void imprimeDados() {
       super.imprimeDados();
       System.out.println("Departamento: " + departamento);
   }
}
tem menu de contexto