public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        // todas herdam os mesmos atributos que a classe pessoa:
        Aluno a1 = new Aluno();
        Professor pr1 = new Professor();
        Funcionario f1 = new Funcionario();

        // entao podemos usar os mesmos metodos de pessoa em qualquer um
        // e cada um tambem vai ter seus proprios metodos
        p1.setNome("Pedro");
        a1.setNome("Maria");
        pr1.setNome("Claudio");
        f1.setNome("Marcia");

        p1.setSexo('M');
        a1.setSexo('F');
        pr1.setSexo('M');
        f1.setSexo('F');
        
        System.out.println("#### Pessoas\n");
        p1.status();
        a1.status();
        pr1.status();
        f1.status();

        System.out.println("\n########\n");
        System.out.println("Aluno");
        a1.setCurso("Matematica");
        System.out.println("Curso: " + a1.getCurso());

        System.out.println("\nProfessor");
        pr1.setSalario(2500.00f);
        pr1.receberAumento(300.0f);
        System.out.println("Salario: " + pr1.getSalario());
        pr1.setIdade(30);
        pr1.getProfessorIdade();
    }
}
