public class App {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.emitirSom();

        Lobo l = new Lobo();
        l.emitirSom();

        Cachorro c = new Cachorro();
        c.emitirSom();

        c.reagir("ola");
        c.reagir(true);
        c.reagir(11);
        c.reagir(14, 13.0f);
    }
}
