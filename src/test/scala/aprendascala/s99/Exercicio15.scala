package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio15 extends Exercicios {

  def duplicateN(n : Int, list : List[Symbol]) = {
  }

  exercicio("Duplique os elementos da lista um determinado número de vezes") {
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should
      equal(List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
    duplicateN(1, List('a)) should equal(List('a))
  }

}
