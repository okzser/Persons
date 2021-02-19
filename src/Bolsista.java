public class Bolsista extends Aluno {

    private int bolsa;

    @Override
    public void pagarMensalidade() {  
        System.out.println("O aluno é bolsista, mensalidade paga com facilidade.");
    }
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}