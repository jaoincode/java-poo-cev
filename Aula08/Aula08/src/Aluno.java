public class Aluno extends Pessoa{ // Classe aluno herda caracteristicas de pessoas
  private int mat;
  private String curso;

  // public methods
  public void cancelarMatr() {
    System.out.println("Matricula cancelada");
  }

  // utils
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
