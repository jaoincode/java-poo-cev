import java.util.Random;

public class Luta {
  private Lutador desafiado;
  private Lutador desafiante;
  private boolean aprovada;

  // metodos 
  public void marcarLuta(Lutador l1, Lutador l2) { // recebe dois lutadores
    if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {  // se o conteudo das categorias for igual e o desafiante diferente
        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
        System.out.println("Luta marcada entre " + l1.getNome() + " e " + l2.getNome());
      } else {
        this.aprovada = false;
        this.desafiado = null;
        this.desafiante = null;
      }
  }

  public void lutar() {
    if(this.aprovada) {
      System.out.println("### DESAFIADO ###");
      this.desafiado.apresentar();
      System.out.println("### DESAFIANTE ###");
      this.desafiante.apresentar();
      System.out.println("#### RESULTADO ####");

      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3); // 0 1 2
      switch(vencedor) {
        case 0: 
          System.out.println("Empatou");
          this.desafiado.empatarLuta();
          this.desafiante.empatarLuta();
          break;
        case 1: 
          System.out.println("Vitoria de " + this.desafiado.getNome());
          this.desafiado.ganharLuta();
          this.desafiante.perderLuta();
          break;
        case 2:
          System.out.println("Vitoria de " + this.desafiante.getNome());
          this.desafiante.ganharLuta();
          this.desafiado.perderLuta();
          break;
      }
    } else {
      System.out.println("A luta nao foi aprovada");
    }
  }

  // especial methods
  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

  public Lutador getDesafiado() {
    return desafiado;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public Lutador getDesafiante() {
    return desafiante;
  }

  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }

  public boolean getAprovada() {
    return aprovada;
  }
}
