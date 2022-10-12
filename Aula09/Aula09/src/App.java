public class App {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setSexo('M');
        v1.setIdade(12);
        v1.status();

        System.out.println("\n#############\n");

        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setSexo('M');
        a1.setIdade(16);
        a1.setCurso("Ciencias da computacao");
        a1.setMat(12410);
        a1.status();
        a1.pagarMensalidade();

        System.out.println("\n#############\n");
        Bolsista b1 = new Bolsista();
        b1.setNome("Marcia");
        b1.setSexo('M');
        b1.setIdade(23);
        b1.setMat(12314);
        b1.setBolsa(12.5f);
        b1.status();
        b1.pagarMensalidade();
    }
}
