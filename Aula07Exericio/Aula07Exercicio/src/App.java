public class App {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Marcia", 17, 'F');
        p[1] = new Pessoa("Joao", 14, 'M');

        l[0] = new Livro("Harry Potter", "JK Rowlling", 255, p[0]);
        l[1] = new Livro("POO - Iniciantes", "Pedro Paulo", 229, p[1]);
        l[2] = new Livro("Java avançado", "Maria Candido", 380, p[1]);

        l[0].abrir();
        l[0].folhear(23); // ir ate a pag 23
        l[0].avancarPag(); // pag 24 agora
        l[0].voltarPag(); // pag 23 de novo 
        l[0].detalhes();
    }
}