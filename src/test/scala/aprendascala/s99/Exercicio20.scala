package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio20 extends Exercicios {

  def removeAt(n : Int, list : List[Symbol]) = {
  }

  exercicio("Remova o Enésimo elemento da lista") {
    """
    Devolva uma Tupla com a lista e o elemento removido. Elementos são numerados a partir de 0.
    """

    removeAt(1, List('a, 'b, 'c, 'd)) should equal((List('a, 'c, 'd), 'b))

    removeAt(0, List('a)) should equal((List(), 'a))
  }

}
