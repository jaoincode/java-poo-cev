public class Car {
  private String brand;
  private String model;
  private float maxVel;
  private float zeroToHundred;
  private int hp;

  // constructor
  public Car (String b, String m, float mv, float z, int h) {
      this.setBrand(b);
      this.setModel(m);
      this.setMaxVel(mv);
      this.setZeroToHundred(z);
      this.setHp(h);
  }


  // public

  public void status () {
      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Max velocity: " + maxVel);
      System.out.println("Zero to a hundred in: " + zeroToHundred + "s");
      System.out.println("Horse Power: " + hp);
  }

  // utilities
  public void setBrand(String brand) {
      this.brand = brand;
  }

  public String getBrand() {
      return brand;
  }

  public void setModel(String model) {
      this.model = model;
  }

  public String getModel() {
      return model;
  }

  public void setMaxVel(float maxVel) {
      this.maxVel = maxVel;
  }

  public float getMaxVel() {
      return maxVel;
  }

  public void setHp(int hp) {
      this.hp = hp;
  }

  public int getHp() {
      return hp;
  }

  public void setZeroToHundred(float zeroToHundred) {
      this.zeroToHundred = zeroToHundred;
  }

  public float getZeroToHundred() {
      return zeroToHundred;
  }
}

