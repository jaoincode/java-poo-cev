public class Carro extends Veiculo{
  private int hp;

  public void andar() {
    System.out.println("O carro agora esta andando");
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getHp() {
    return hp;
  }
}
