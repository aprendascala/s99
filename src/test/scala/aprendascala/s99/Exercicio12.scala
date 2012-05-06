package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio12 extends Exercicios {

  def decode(list : List[(Int, Symbol)]) = {
  }

  exercicio("Decodifique uma lista codificada em run-length") {
    """
    Dada uma lista codificada em run-length (como especificado no exercício 10), construa a sua versão
    descomprimida.
    """

    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should
      equal(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    decode(List((1, 'a), (1, 'b), (1, 'c), (1, 'g))) should equal(List('a, 'b, 'c, 'g))
  }

}
