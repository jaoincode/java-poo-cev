public class Visualizacao {
  private Viewer espectador;
  private Video filme;

  public Visualizacao(Viewer v, Video f) {
    this.setEspectador(v);
    this.setFilme(f);
  }

  public void status() {
    this.filme.setViews(this.filme.getViews() + 1);
    this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
    this.getEspectador().status();
    this.getFilme().status();
  }

  public void avaliar() {
    this.filme.setAvaliacao(5);
  }

  public void avaliar(int nota) {
    this.filme.setAvaliacao(nota);
  }

  public void avaliar(float porc) {
    int tot = 0;
    if(porc <= 20)  {
      tot = 3;
    } else if(porc <= 50) {
      tot =5;
    } else if (porc <= 90) {
      tot = 8;
    } else tot = 10;

    this.filme.setAvaliacao(tot);
  }

  public void setEspectador(Viewer espectador) {
    this.espectador = espectador;
  }

  public Viewer getEspectador() {
    return espectador;
  }

  public void setFilme(Video filme) {
    this.filme = filme;
  }

  public Video getFilme() {
    return filme;
  }
}
