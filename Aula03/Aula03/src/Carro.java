public class Carro {
  String marca;
  String cor;
  int rodas;

  public Carro(String m, String c, int r) {
    setMarca(m);
    setCor(c);
    setRodas(r);
  }

  public void status(){
    System.out.println("marca " + this.marca);
    System.out.println("cor " + this.cor);
    System.out.println("rodas " + this.rodas);
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return this.marca;
  }
  
  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getCor() {
    return this.cor;
  }

  public int getRodas() {
    return this.rodas;
  }

  public void setRodas(int rodas) {
    this.rodas = rodas;
  }
}
