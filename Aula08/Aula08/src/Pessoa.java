public class Pessoa { // Classe que vai ser mae das outras
  private String nome;
  private int idade;
  private char sexo;

  // public Pessoa (String n, int i, char s) {
  //   this.setNome(n);
  //   this.setIdade(i);
  //   this.setSexo(s);
  // }

  // public methods 
  public void status() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Sexo: " + this.getSexo());
  }

  public void fazerAniver() {
    this.setIdade(this.getIdade() + 1);
    System.out.println("Idade agora " + this.getIdade());
  }

  // utils

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
