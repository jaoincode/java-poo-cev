
public class App {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        videos[0] = new Video("Aula 1 de POO");
        videos[0].play();
        videos[0].like();
        videos[1] = new Video("Aula 12 de PHP");
        videos[2] = new Video("Never gonna give you up");

        Viewer viewers[] = new Viewer[2];
        viewers[0] = new Viewer("Joao", 17, 'M', "joao123");
        viewers[1] = new Viewer("Cleusa", 27, 'F', "cleusa123");

        Visualizacao v[]= new Visualizacao[5];
        v[0] = new Visualizacao(viewers[0], videos[0]); // Joao assiste Aula 1
        v[1] = new Visualizacao(viewers[0], videos[1]); // Joao assiste Aula 12
        
        v[0].avaliar(35.0f);

        v[0].status();
        v[1].status();
        // viewers[1].status();
        // System.out.println("\n############\n");
        // videos[0].status();
    }
}
