
public abstract class Pessoas {
      
    private String nome;
    private char sexo;
    private int idade;
    private String tipo;
      
    public void fazerAniv() {
      this.idade++;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String n) {
      this.nome = n;
   }

   public char getSexo() {
      return sexo;
   }

   public void setSexo(char s) {
      this.sexo = s;
   }

   public int getIdade() {
      return this.idade;
   }

   public void setIdade(int i) {
      this.idade = i;
   }	

   public void detalhes() {
      System.out.println("\n");
      System.out.println("Tipo: " + this.getClass());
      System.out.println("Nome: " + this.getNome());
      System.out.println("Idade: " + this.getIdade());
      System.out.println("Sexo: " + this.getSexo());
      
   }
}


