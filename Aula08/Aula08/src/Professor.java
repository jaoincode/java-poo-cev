public class Professor extends Pessoa{
  private String especialidade;
  private float salario;

  public void receberAumento(float aum) {
    this.setSalario(this.getSalario() + aum);
    System.out.println("Aumento recebido, salario atual R$" + this.getSalario());
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public float getSalario() {
    return salario;
  }

  public void getProfessorIdade() {
    System.out.println("Idade: " + this.getIdade()); // get idade é herdado da classe pessoa
  }
}
