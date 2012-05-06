package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio11 extends Exercicios {

  def encodeModificado(list : List[Symbol]) = {
  }

  exercicio("Codificação Run-length modificada") {
    """
    Modifique o resultado do exercício 10 de forma que se um elemento não tem duplicatas ele é simplesmente
    copiado na lista de resultados. Somente elementos com duplicatas são transferidos como tuplas (N, E)
    """

    encodeModificado(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should
      equal(List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e)))
    encodeModificado(List('a, 'b, 'c, 'g)) should equal(List('a, 'b, 'c, 'g))
  }

}
