public class Funcionario extends Pessoa{
  private String setor;
  private boolean trabalhando;

  public void mudarTrabalho() {
    this.trabalhando = !this.trabalhando; // true | false
    System.out.println("Esta trabalhando: " + this.getTrabalhando());
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public String getSetor() {
    return setor;
  }
  
  public void setTrabalhando(boolean trabalhando) {
    this.trabalhando = trabalhando;
  }

  public boolean getTrabalhando() {
    return trabalhando;
  }
}