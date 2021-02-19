public class ProgramaPrincipal {
        public static void main(String[] args) {

            Visitante v1 = new Visitante();
            v1.setNome("Mauro");
            v1.setSexo('M');
            v1.setIdade(48);

            Aluno a1 = new Aluno();
            a1.setNome("Lucas");
            a1.setSexo('M');
            a1.setIdade(18);
            a1.setCurso("Matemática");
            a1.setMatricula(1111);
            a1.pagarMensalidade();
            
            Bolsista b1 = new Bolsista();
            b1.setNome("Luara");
            b1.setSexo('F');
            b1.setIdade(15);
            b1.pagarMensalidade();

            Tecnico t1 = new Tecnico();
            t1.setNome("Maria");
            t1.setSexo('F');
            t1.setIdade(17);
            t1.setCurso("Informática");
            t1.setRegPro("Senior");

            Professor p1 = new Professor();
            p1.setNome("Paulo");
            p1.setSexo('M');
            p1.setIdade(37);
            p1.setSalario(3744.89f);
            p1.setEspecialidade("Física");
        
            b1.detalhes();      
            a1.detalhes();
            v1.detalhes();
            p1.detalhes();
            t1.detalhes();

        }
        public static void Ola() {

        }
}