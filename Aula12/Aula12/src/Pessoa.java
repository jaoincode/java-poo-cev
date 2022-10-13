public abstract class Pessoa {
  protected String nome;
  protected int idade;
  protected char sexo;
  protected float experiencia;

  public Pessoa(String n, int i, char s) {
    this.setNome(n);
    this.setIdade(i);
    this.setSexo(s);
  }

  public void status() {
    System.out.println("Nome " + this.getNome());
    System.out.println("Idade " + this.getIdade());
    System.out.println("Sexo " + this.getSexo());
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

  public void setExperiencia(float experiencia) {
    this.experiencia = experiencia;
  }

  public float getExperiencia() {
    return experiencia;
  }
}
