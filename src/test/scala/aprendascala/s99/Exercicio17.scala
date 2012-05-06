package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio17 extends Exercicios {

  def split(n : Int, list : List[Symbol]) = {
  }

  exercicio("Corte uma lista em duas partes") {
    """
    O tamanho da primeira parte é dado. Use uma tupla para o seu resultado.
    """

    split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should
      equal((List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    split(1, List('a, 'b)) should equal((List('a), List('b)))
  }

}
