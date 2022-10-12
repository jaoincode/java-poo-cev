public class Aluno extends Pessoa{ 
  // Herança para diferença
  // -> Tem tudo que Pessoa tem + suas próprias caracteristicas
  private int mat;
  private String curso;

  // se for public final void pagarMensalidade(){...} nao ira ser possivel sobrepor o método em outras classes (isso também funciona para classes)
  public void pagarMensalidade() {
    System.out.println("Pagando mensalidade do aluno " + this.getNome());
  }

  public void setMat(int mat) {
    this.mat = mat;
  }

  public int getMat() {
    return mat;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getCurso() {
    return curso;
  }
}
