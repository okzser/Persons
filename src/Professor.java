public class Professor extends Pessoas{

     private String especialidade;
     private float salario;

    public void receberAumento(float s){
        this.salario = this.salario + s;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario (float s) {
        this.salario = s;
    }

}
