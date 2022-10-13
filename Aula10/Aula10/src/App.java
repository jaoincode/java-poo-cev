public class App {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        GoldFish gf = new GoldFish();
        Arara ar = new Arara();

        c.locomover();
        c.usarBolsa();

        ca.locomover();
        ca.emitirSom();

        System.out.println("\n##############\n");

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        r.locomover();
        p.locomover();
    }
}
