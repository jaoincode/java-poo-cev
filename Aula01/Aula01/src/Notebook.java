public class Notebook {
  String modelo;
  String cor;
  float polegadas;
  boolean aberto = false;
  boolean ligado = false;

  void status() {
    System.out.println(modelo);
    System.out.println(cor);
    System.out.println(polegadas);
    System.out.println("Aberto: " + aberto);
  }

  void abrir() {
    if(aberto) System.out.println("Ja estou aberto");
    else {
      aberto = true;
      System.out.println("Abri!");
    }
  }

  void fechar() {
    if(!aberto) System.out.println("Ja estou fechado");
    else {
      aberto = false;
      if(ligado) ligado = false;
      System.out.println("Fechei");
    }
  }

  void ligar() {
    if(!aberto) System.out.println("Nao estou aberto, nao e possivel ligar");
    else {
      if(ligado) System.out.println("Ja estou ligado");
      else {
        ligado = true;
        System.out.println("Ligando...");
      }
    }
  }
}
