public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "azul";
        // c1.ponta = 0.5f;
        c1.carga = 12; // -> Consigo mexer no protegido pois ele esta dentro de uma classe que usa a classe Caneta

        c1.status();

        c1.destampar();

        c1.rabiscar();
    }
}
