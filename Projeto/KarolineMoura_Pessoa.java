public class KarolineMoura_Pessoa {
   private String nome;
   private int idade;
   public KarolineMoura_Pessoa(String nome, int idade) {
       this.nome = nome;
       this.idade = idade;
   }
   public String getNome() {
       return nome;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public int getIdade() {
       return idade;
   }
   public void setIdade(int idade) {
       this.idade = idade;
   }
   public void imprimeDados() {
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
   }
}