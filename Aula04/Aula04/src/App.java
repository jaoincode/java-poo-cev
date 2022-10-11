public class App {
    public static void main(String[] args) throws Exception {
        // CC
        Conta p1 = new Conta();
        p1.setNumConta(111);
        p1.setDono("Joao");
        p1.abrirConta("CC");
        p1.depositar(130);
        p1.sacar(181);
        p1.estadoAtual();

        // CP
        Conta p2 = new Conta();
        p2.setNumConta(222);
        p2.setDono("Marcia");
        p2.abrirConta("CP");
        p2.sacar(130);
        p2.estadoAtual();
    }  
}
