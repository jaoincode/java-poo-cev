public class Video implements AcoesVideo {
  private String titulo;
  private int avaliacao;
  private int views;
  private int curtidas;
  private boolean reproduzindo;

  public Video(String t) {
    this.setTitulo(t);
    this.setAvaliacao(1);
    this.setViews(0);
    this.setCurtidas(0);
    this.setReproduzindo(false);
  }

  public void status() {
    System.out.println("Titulo " + this.getTitulo());
    System.out.println("Avaliacao " + this.getAvaliacao());
    System.out.println("Views " +  this.getViews());
    System.out.println("Curtidas " + this.getCurtidas());
    System.out.println("Reproduzindo " + this.getReproduzindo());
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
  }

  public int getAvaliacao() {
    return avaliacao;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public int getViews() {
    return views;
  }

  public void setCurtidas(int curtidas) {
    this.curtidas = curtidas;
  }

  public int getCurtidas() {
    return curtidas;
  }

  public void setReproduzindo(boolean reproduzindo) {
    this.reproduzindo = reproduzindo;
  }

  public boolean getReproduzindo() {
    return reproduzindo;
  }

  // metodos da interface

  @Override
  public void play() {
    this.setReproduzindo(true);
  }

  @Override
  public void pause() {
    this.setReproduzindo(false);
  }

  @Override
  public void like() {
    this.setCurtidas(this.getCurtidas() + 1);
  }
  
}
