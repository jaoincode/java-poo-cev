public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada = true;

  public void status() {
    System.out.println("Uma caneta " + this.cor); // this -> autoreferencia
    System.out.println("Esta tampada " + this.tampada);
    System.out.println("Ponta " + this.ponta);
    System.out.println("Modelo " + this.modelo);
    System.out.println("Carga " + this.carga);
  }

  public void rabiscar() {
    if(this.tampada) System.out.println("Nao posso rabiscar! Estou tampada");
    else System.out.println("Rabiscando...");
  }

  // Mexendo num atributo privado: 
  // pode mexer no atributo privado pois estes metodos estao dentro da própria classe
  public void tampar() {
    if(this.tampada) System.out.println("Ja esta tampada");
    else {
      System.out.println("Tampada");
      this.tampada = true;
    };
  }

  public void destampar() {
    if(!this.tampada) System.out.println("Ja esta destampada");
    else {
      System.out.println("Destampada");
      this.tampada = false;
    };
  }
}
