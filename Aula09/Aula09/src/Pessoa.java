public abstract class Pessoa { // Classe abstrata (nao pode ser diretamente instanciada)
  protected String nome;
  private int idade;
  private char sexo;

  public void status() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
  }

  public void fazerAniver() {
    this.setIdade(this.getIdade() + 1);
    System.out.println("Idade agora " + this.getIdade());
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public char getSexo() {
    return sexo;
  }
}
