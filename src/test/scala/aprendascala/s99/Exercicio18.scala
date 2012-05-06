package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio18 extends Exercicios {

  def slice(begin : Int, end : Int, list : List[Symbol]) = {
  }

  exercicio("Extraia um pedaço da lista") {
    """
    Dados dois índices. I e K, o pedaço da lista é a lista contendo os elementos
    a partir do Iésimo elemento (inclusivo) até o Késimo elemento (exclusivo) da
    lista original. Comece a contar os elementos a partir de 0.
    """

    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should
      equal(List('d, 'e, 'f, 'g))

    slice(1, 2, List('a, 'b, 'c)) should equal(List('b))
  }

}
