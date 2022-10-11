public class Caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status() {
    System.out.println("Uma caneta " + this.cor); // this -> autoreferencia
    System.out.println("Esta tampada " + this.tampada);
    System.out.println("Ponta " + this.ponta);
    System.out.println("Modelo " + this.modelo);
    System.out.println("Carga " + this.carga);
  }

  void rabiscar() {
    if(this.tampada) System.out.println("Nao posso rabiscar! Estou tampada");
    else System.out.println("Rabiscando...");
  }

  void tampar() {
    if(this.tampada) System.out.println("Ja esta tampada");
    else {
      System.out.println("Tampada");
      this.tampada = true;
    };
  }

  void destampar() {
    if(!this.tampada) System.out.println("Ja esta destampada");
    else {
      System.out.println("Destampada");
      this.tampada = false;
    };
  }
}
