public class App {
    public static void main(String[] args) throws Exception {
        // instanciando um objeto da nossa classe
        Caneta c1 = new Caneta(); 
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        
        // executando metodos do novo objeto
        c1.status();

        c1.destampar();

        c1.rabiscar();
        
        System.out.println("\n");

        // instanciando outro objeto da classe
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.carga = 100;
        c2.cor = "vermelha";
        c2.tampada = true;
        c2.ponta = 1.2f;

        c2.status();

        c2.rabiscar();

        System.out.println("\n");

        Notebook n1 = new Notebook();
        n1.modelo = "Apple";
        n1.cor = "Branco";
        n1.polegadas = 13.5f;

        n1.status();

        n1.abrir();

        n1.ligar();

        n1.fechar();

        System.out.println("\nApos fechar: ");

        n1.status();
    }
}
