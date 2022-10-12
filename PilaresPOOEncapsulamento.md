### A POO tem 3 pilares (EHP):

<ul>
  <li>E  Encapsulamento</li>
  <li>H  Herança</li>
  <li>P  Polimorfismo</li>
</ul>

<hr/>

#### ENCAPSULAMENTO

<p>Proteger os atributos internos para que nada de fora possa acessa-los</p>
<p><b>Encapsular</b> não é necessario mas é uma boa prática.</p>

##### Vantagens em encapsular

<ul>
  <li>Tornar mudanças invisíveis.</li>
  <li>Facilitar reutilização de código.</li>
  <li>Reduzir efeitos colaterais.</li>
</ul>

<hr/>

#### HERANÇA

<p>Herdar caracteristicas de outras classes e comportamentos.</p>
<p>Permite basear uma nova classe na definição de uma outra classe previamente existente.</p>
<p>Podemos sobrepor um método de um método anterior</p>

##### Ex

<p>Classes aluno, professor, funcionario são classes filhos e herdam as caracteristicas de uma pessoa (Classe mãe).</p>

<hr/>

##### Algumas definições

<p>- A classe mae é a super-classe, e a filha que herda a mãe é a sub-classe, uma sub-classe também pode ser uma super-classe de uma outra classe que herda as caracteristicas dela.</p>
<p>- Uma classe que nao tem superclasses é considerada a raiz de uma árvore de classes.</p>
<p>- As classes que nao tem filhas, no momento, podemos chamar de folhas.</p>
<p>- Quando percorremos uma arvore de cima para baixo, chamamos de especialização, e de baixo pra cima, chamamos de generalização.</p>

##### Tipos de heranças

<ul>
  <li><b>Herança de implementação</b> - Ex: Visitante recebe apenas as caracteristicas de Pessoa</li>
  <li><b>Herança para diferença</b> - Ex: Professor recebe as caracteristicas de Pessoa e também suas próprias caracteristicas</li>
</ul>
<hr/>

##### Abstrato e final

<p><b>Classe Abstrata</b> - Não pode ser instanciada, so serve como progenitora.</p>
<p><b>Metodo Abstrato</b> - Declarado mas não implementado na progenitora.</p>
<p><b>Classe Final</b> - Não pode ser herdada por outra classe. Obrigatoriamente é uma folha, sem filhos</p>
<p><b>Metodo Final</b> - Não pode ser sobrescrito pelas suas sub-classes. Obrigatoriamente herdado</p>
