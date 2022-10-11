## POO = Programação orientada a objetos

#### Criador = <b>Alan Kay</b> (Biologo e matematico)

- Ele acreditava que um computador deveria funcionar como uma célula, e cada célula ter sua respectiva função, que no final é usada pelo computador todo.

### Como era antes ?

- Os dados eram globais, e existiam vários procedimentos, todos misturados, e alguns procedimentos ainda não usavam todos os dados que estavam misturados nesse meio.

### Como ficou ?

- Temos dados de objetos e métodos que fazem uso dos dados que percentem a aquele objeto, e não precisamos ter só um objeto, podemos ter vários objetos com vários métodos, e podemos comunicar objetos um com outro.

#### Algumas linguagems POO

<ul style="display: flex">
  <li>C++</li>
  <li>Java</li>
  <li>PHP</li>
  <li>Python</li>
  <li>Ruby</li>
  <li>C#</li>
  <li>Objective-C / Swift</li>
</ul>

### Vantagens (COMERNada)

<ul>
  <li>
    <h5>C - Confiável</h5>
    <p>O isolamento entre as partes gera software seguro. Ao alterar uma parte nenhuma outra é afetada.</p>
  </li>
    <li>
    <h5>O - Oportuno</h5>
    <p>Ao dividir tudo em partes, várias delas podem ser desenvolvidas em paralelo.</p>
  </li>
  <li>
    <h5>M - Manutenivel</h5>
    <p>Atualizar um software é mais fácil. Uma pequena modificação vai beneficiar todas as partes que usarem o objeto.</p>
  </li>
  <li>
    <h5>E - Extensivel</h5>
    <p>O software não é estatico, deve crescer para permanecer util.</p>
  </li>
  <li>
    <h5>R - Reutilizavel</h5>
    <p>Podemos usar objetos de um sistema que criamos em outro sistema futuro.</p>
  </li>
    <li>
    <h5>N - Natural</h5>
    <p>Mais fácil de entender. Você se preocupa mais na funcionalidade do que nos detalhes de implementação.</p>
  </li>
</ul>

### O que é um objeto ?

- <b>Definição: </b>Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio de suas caracteristicas e comportamento atual.

- Um objeto tem três perguntas, o que tenho, o que eu faço, como estou agora ?

##### Ex: Caneta

<code>
  classe Caneta {
    caracteristicas {
      modelo: Caractere
      cor: Caractere
      carga: Inteiro
      tampada: Logico
    }

    metodo Rabiscar () {

    }

    metodo Tampar () {

    }

}
</code>

- Classe: Define os atributos e métodos comuns que serão compartilhados pro um objeto.
- Objeto: Uma instância de uma classe.
