## DIAGRAMA DE CLASSES

#### -> Estrutura: Retangulo

<ul>
<li>
-- Nome da classe (ex caneta)
</li>
<li>
-- Atributos:
modelo
cor
ponta
carga
tampada
</li>
<li>
-- Metodos:
escrever()
rabiscar()
pintar()
tampar()
destampar()
</li>
</ul>

#### -> Modificadores de visibilidade: Indicam o nível de acesso aos componentes internos de uma classe

<ul>
-- Simbolos

<li>+ -> Público: a classe atual e todas as outras classes tem acesso a ela.</li>

<li>- -> Privado: somente a classe atual.</li>

<li>#'-> Protegido: a classe atual e todas as suas sub-classes.</li>
<ul>

Ex na caneta = {
+modelo
+cor
-ponta
#carga
#tampada

+escrever()
+rabiscar()
+pintar()
-tampar()
-destampar()
}
