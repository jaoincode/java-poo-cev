public class Lutador {
  // atributos
  private String nome, nacionalidade, categoria;
  private int idade, vitorias, derrotas, empates;
  private float altura, peso;

  // metodos publicos
  public void apresentar() {
    System.out.println("---------------------------");
    System.out.println("Apresentando Lutador----");
    System.out.println("Lutador " + this.getNome());
    System.out.println("Origem " + this.getNacionalidade());
    System.out.println(this.getIdade() + " anos");
    System.out.println("Pesando " + this.getPeso() + " Kg e com " + this.getAltura() + "m de altura");
  }

  public void status () {
    System.out.println("---------------------------");
    System.out.println(this.getNome() + " e um peso " + this.getCategoria());
    System.out.println("Ganhou " + getVitorias());
    System.out.println("Perdeu " + getDerrotas());
    System.out.println("Empatou " + getEmpates());
  }

  public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
  }

  public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
  }

  public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
  }

  // metodos especiais
  public Lutador (
    String nome, String nacionalidade,  
    int idade, int vitorias, int derrotas, int empates, 
    float altura, float peso
  ) {
    this.setNome(nome);
    this.setNacionalidade(nacionalidade);
    this.setIdade(idade); 
    this.setVitorias(vitorias);
    this.setDerrotas(derrotas);
    this.setEmpates(empates);
    this.setAltura(altura);
    this.setPeso(peso);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getVitorias() {
    return vitorias;
  }

  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public int getDerrotas() {
    return derrotas;
  }

  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getEmpates() {
    return empates;
  }

  public void setEmpates(int empates) {
    this.empates = empates;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
  }

  private void setCategoria() {
    if(this.getPeso() < 52.2) this.categoria = "Invalido";
    else if(this.getPeso() <= 70.3) this.categoria = "Leve";
    else if(this.getPeso() <= 83.9) this.categoria = "Medio";
    else if(this.getPeso() <= 120.2) this.categoria = "Pesado";
    else this.categoria = "Invalido";
  }

  public String getCategoria() {
    return categoria;
  }
}
