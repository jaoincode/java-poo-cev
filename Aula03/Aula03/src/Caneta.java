public class Caneta {
  private String modelo;
  private float ponta;
  private boolean tampada;
  private String cor;

  // método construtor:
  public Caneta(String m, String c, float p) {
    // define o estado inicial
    setTampada(true);
    setModelo(m);
    setPonta(p);
    this.cor = c;
  }

  // metodos publicos para manipular os atributos mesmo que privados
  // Getters & Setters
  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String m) {
    this.modelo = m;
  }

  public float getPonta() {
    return this.ponta;
  }

  public void setPonta(float p) {
    this.ponta = p;
  }

  public void setTampada (boolean tampada) {
    this.tampada = tampada;
  }

  public void status() {
    System.out.println("Modelo " + this.modelo);
    System.out.println("Ponta " + this.getPonta());
    System.out.println("Cor " + this.cor);
    System.out.println("Tampada " + this.tampada);
  }
}
