public class Livro implements Publicacao{
  private String titulo;
  private String autor;
  private int totPaginas;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  public Livro(String t, String a, int tp, Pessoa l) {
    this.setTitulo(t);
    this.setAutor(a);
    this.setTotPaginas(tp);
    this.setLeitor(l);
    this.aberto = false;
    this.pagAtual = 0;
  }

  public void detalhes() {
    System.out.println(this.getTitulo());
    System.out.println(this.getAutor());
    System.out.println("Total pag " + this.getTotPaginas());
    System.out.println("Pag atual " + this.pagAtual);
    System.out.println("Aberto " + this.aberto);
    System.out.println("### Leitor");
    this.getLeitor().status();
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutor() {
    return autor;
  }

  public void setTotPaginas(int totPaginas) {
    this.totPaginas = totPaginas;
  }

  public int getTotPaginas() {
    return totPaginas;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  // Interface publicacao

  @Override
  public void abrir() {
    this.aberto = true;
  }

  @Override
  public void fechar() {
    this.aberto = false;
  }

  @Override
  public void folhear(int p) {
    if(p > this.getTotPaginas()) System.out.println("O livro nao tem esta pagina");
    else this.pagAtual = p;
  }

  @Override
  public void avancarPag() {
    this.pagAtual++;
  }

  @Override
  public void voltarPag() {
    this.pagAtual--;
  }
}
