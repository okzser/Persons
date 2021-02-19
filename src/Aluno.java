public class Aluno extends Pessoas {

    private String curso;
    private int matricula;
    
    public void pagarMensalidade() {   
        System.out.println("Mensalidade paga com sucesso.");
    }

    public String getCurso() {
      return curso;
    }
    public void setCurso(String c) {
      this.curso = c;
    }
    
    public int getMatricula() {
      return matricula;
    }
    public void setMatricula(int m) {
      this.matricula = m;
    }
    @Override
    public void detalhes() {
        System.out.println("\n");
        System.out.println("Tipo: " + this.getClass());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Matricula: " + this.getMatricula());


        
     }

}