public class Tecnico extends Aluno{
    
    private String registroProfissional;

    public void praticar() {
        System.out.println("Praticando");
    }

    public String registroProfissional(){
        return registroProfissional;
    }

    public void setRegPro(String r){
        this.registroProfissional = r;
    }
}