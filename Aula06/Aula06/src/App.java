public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6]; // criando vetor de lutadores com o tamanho de 6

        l[0] = new Lutador("Pretty Boy", "Brazil", 20, 3, 0, 0, 1.75f, 65.0f);

        l[1] = new Lutador("Putscript", "Franca", 25, 29, 3, 10, 1.68f, 57.8f);

        l[2] = new Lutador("Snapshadow", "EUA", 35, 8, 3, 0, 1.65f, 80.9f);
        
        l[3] = new Lutador("Dead Code", "Brazil", 20, 3, 0, 0, 1.93f, 81.6f);

        l[4] = new Lutador("Ufco Bol", "Australia", 25, 3, 3, 0, 1.70f, 119.0f);

        l[5] = new Lutador("Nerdart", "Brazil", 30, 7, 10, 2, 1.81f, 105.7f); 

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();


        l[0].status();
        l[1].status();
    }  
}
