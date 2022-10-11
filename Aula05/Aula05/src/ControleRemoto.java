public class ControleRemoto implements Controlador{
  private int volume;
  private boolean ligado;
  private boolean tocando;

  public ControleRemoto() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  }

  private void setVolume(int volume) {
    this.volume = volume;
  }

  private void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  private void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  private int getVolume() {
    return this.volume;
  }

  private boolean getLigado() {
    return this.ligado;
  }

  private boolean getTocando() {
    return this.tocando;
  }

  // Controlador 
  // Métodos abstratos
  @Override // significa que estou reescrevendo os metodos ja definidos
  public void ligar() {
    this.setLigado(true);
  }

  @Override
  public void desligar() {
    this.setLigado(false);
  }

  @Override
  public void abrirMenu() {
    System.out.println("Esta ligado? " + this.getLigado());
    System.out.println("Esta tocando? " + this.getTocando());
    System.out.println("Volume " + this.getVolume());
    for(int i = 0; i < this.getVolume(); i += 10) {
      System.out.print("[]");
    }
  }

  @Override
  public void fecharMenu() {
    System.out.println("Fechando menu");
  }

  @Override
  public void maisVolume() {
    if(this.getLigado()) this.setVolume(this.getVolume() + 10);
    else System.out.println("Nao foi possivel, objeto desligado");
  }

  @Override
  public void menosVolume() {
    if(this.getLigado()) this.setVolume(this.getVolume() - 10);
    else System.out.println("Nao foi possivel, objeto desligado");
  }

  @Override
  public void ligarMudo() {
    if(this.getLigado() && this.getVolume() > 0) this.setVolume(0); 
  }

  @Override
  public void desligarMudo() {
    if(this.getLigado() && this.getVolume() == 0) this.setVolume(50); 
  }

  @Override
  public void play() {
    if(!this.getTocando()) this.setTocando(true);
  }

  @Override
  public void pause() {
    if(this.getTocando()) this.setTocando(false);    
  }
}
