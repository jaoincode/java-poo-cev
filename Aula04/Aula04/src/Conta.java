public class Conta {
  public int numConta;
  protected String tipo;
  private String dono;
  private double saldo; 
  private boolean status; 

  public Conta() {
    this.saldo = 0;
    this.setStatus(false);
  }

  public void estadoAtual() {
    System.out.println("---------------------------");
    System.out.println("Conta: " + this.getNumConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Dono: " + this.getDono());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.getStatus());
  }
  
  public void setNumConta(int num) {
    this.numConta = num;
  }

  public int getNumConta() {
    return this.numConta;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public String getDono() {
    return this.dono;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public boolean getStatus() {
    return this.status;
  }

  public void abrirConta(String tipo) {
    this.setTipo(tipo);
    this.setStatus(true);
    if(this.tipo == "CC") this.setSaldo(50);
    else if(this.tipo == "CP") this.setSaldo(150);
  }

  public void fecharConta() {
    if(this.getSaldo() > 0) System.out.println("Voce ainda tem dinheiro na conta!");
    else if(this.getSaldo() < 0) System.out.println("Conta em debito!");
    else {
      System.out.println("Conta fechada");
      this.setStatus(false);
    }
  }

  public void depositar(int qnt) {
    if(this.getStatus()) this.setSaldo(this.getSaldo() + qnt);
    else System.out.println("Impossibilitado! Esta conta esta fechada");
  }

  public void sacar(int qnt) {
    if(this.getStatus()) {
      if(qnt <= this.getSaldo()) {
        this.setSaldo(this.getSaldo() - qnt);
        System.out.println("Saque realizado");
      } else {
        System.out.println("Voce nao tem saldo suficiente, saldo: " + this.saldo);
      }
    } else  System.out.println("Impossibilitado! Esta conta esta fechada");
  }

  public void pagarMensal() {
    double v = 0;
    if(this.getTipo() == "CC") v = 12;
    else if(this.getTipo() == "CP") v = 20;

    if(this.getStatus()) {
      if(this.getSaldo() > v) this.setSaldo(this.saldo - v);
      else System.out.println("Impossivel pagar");
    }
  }


  
}
