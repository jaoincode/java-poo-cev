public class Race {
  private Car challanger;
  private Car challanged;
  private boolean approved;

  public void markRace (Car c1, Car c2) {
      if(c1 != c2) {
          setApproved(true);
          setChallanger(c1);
          setChallanged(c2);
          System.out.println("Corrida marcada entre " + c1.getBrand() + " " + c1.getModel() + " e " + c2.getBrand() + " " + c2.getModel());
      } else {
          setApproved(false);
          setChallanger(null);
          setChallanged(null);
          System.out.println("Nao foi possivel marcar a corrida");
      }
  }

  public void race() {
      if(getApproved()) {
          String winner = getChallanged().getMaxVel() > getChallanger().getMaxVel() ?
                  getChallanged().getBrand() : getChallanger().getBrand();
          System.out.println("O vencedor e o carro " + winner);
       } else {
          System.out.println("Sem permissao para fazer a corrida");
      }
  }


  public void setChallanger(Car challanger) {
      this.challanger = challanger;
  }

  public Car getChallanger() {
      return challanger;
  }

  public void setChallanged(Car challanged) {
      this.challanged = challanged;
  }

  public Car getChallanged() {
      return challanged;
  }

  public void setApproved(boolean approved) {
      this.approved = approved;
  }

  public boolean getApproved() {
      return approved;
  }
}
