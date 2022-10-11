public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("Bic", "amarela", 0.4f);
        c1.status();
        System.out.println("");
        Caneta c2 = new Caneta("Faber Castel", "azul", 0.4f);
        c2.status();
        
        // atribuindo valores com setter
        // c1.setModelo("Bic"); 
        // c1.setPonta(1.3f);

        System.out.println("");

        Carro carro1 = new Carro("Volkswagem", "cinza", 4);
        carro1.status();

        System.out.println("");

        Carro carro2 = new Carro("Fiat", "vermelho", 4);
        carro2.status();
    }
}
