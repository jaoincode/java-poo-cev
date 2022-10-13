public abstract class Veiculo {
  private int maxVel;
  private String name;
  private int capacity;

  public void status() {
    System.out.println("Velocidade maxima: " + this.getMaxVel());
    System.out.println("Nome: " + this.getName());
    System.out.println("Suporta até: " + this.getCapacity() + " pessoas");
  }

  public void setMaxVel(int maxVel) {
    this.maxVel = maxVel;
  }

  public int getMaxVel() {
    return maxVel;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getCapacity() {
    return capacity;
  }
}
