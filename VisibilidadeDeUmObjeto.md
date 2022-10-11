## DIAGRAMA DE CLASSES

-> Estrutura: Retangulo
    -- Nome da classe (ex caneta)
    -- Atributos: 
      modelo
      cor
      ponta
      carga
      tampada
    -- Metodos: 
      escrever()
      rabiscar()
      pintar()
      tampar()
      destampar()

-> Modificadores de visibilidade: Indicam o nível de acesso aos componentes internos de uma classe
  -- Simbolos
   + -> Público: a classe atual e todas as outras classes tem acesso a ela.
   - -> Privado: somente a classe atual.
   #'-> Protegido: a classe atual e todas as suas sub-classes

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