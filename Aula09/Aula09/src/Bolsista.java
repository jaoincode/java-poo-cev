public class Bolsista extends Aluno {
  // Herda tudo de Aluno que herda tudo de Pessoa
  private float bolsa;

  public void renovarBolsa() {
    System.out.println("Renovando bolsa de " + this.nome);
  }

  @Override // sobrepondo o metodo de Aluno
  public void pagarMensalidade() {
    System.out.println(this.nome + " e bolsista, pagamento facilitado!");
  }

  public void setBolsa(float bolsa) {
    this.bolsa = bolsa;
  }

  public float getBolsa() {
    return bolsa;
  }

}
