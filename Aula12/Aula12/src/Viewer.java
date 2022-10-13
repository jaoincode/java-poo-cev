public class Viewer extends Pessoa {
  private String login;
  private int totAssistido;

  public Viewer(String nome, int idade, char sexo, String login) {
    super(nome, idade, sexo);
    this.setLogin(login);
    this.setTotAssistido(0);
  }

  @Override
  public void status() {
    System.out.println("Nome " + this.getNome());
    System.out.println("Idade " + this.getIdade());
    System.out.println("Sexo " + this.getSexo());
    System.out.println("Login: " + this.getLogin());
    System.out.println("Total assistido: " + this.getTotAssistido());
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getLogin() {
    return login;
  }

  public void setTotAssistido(int totAssistido) {
    this.totAssistido = totAssistido;
  }
  public int getTotAssistido() {
    return totAssistido;
  }

}
