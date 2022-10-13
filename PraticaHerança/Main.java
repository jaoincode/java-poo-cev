public class Main {
  public static void main(String[] args) {
    Carro c1 = new Carro();
    c1.setName("Corsa");
    c1.setMaxVel(130);
    c1.setCapacity(5);
    c1.setHp(70);
    c1.status();
    System.out.println(c1.getHp() + "CV");
    c1.andar();

    System.out.println("\n################\n");

    Moto m1 = new Moto();
    m1.setName("XJ6");
    m1.setMaxVel(220);
    m1.setCapacity(2);
    m1.setHp(130);
    m1.status();
    System.out.println(m1.getHp() + "CV");
    m1.andar();
  }
}
