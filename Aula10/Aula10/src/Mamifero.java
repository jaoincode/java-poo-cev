public class Mamifero extends Animal{
  private String corPelo;

  @Override
  public void locomover() {
    System.out.println("Andando...");
    
  }

  @Override
  public void alimentar() {
    System.out.println("Mamando...");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de mamifero");
  }

  public void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
  }

  public String getCorPelo() {
    return corPelo;
  }
}
