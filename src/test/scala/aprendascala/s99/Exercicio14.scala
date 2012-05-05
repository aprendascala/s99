package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio14 extends Exercicios {

  def duplicate(list : List[Symbol]) = {
  }

  exercicio("Deve Duplicar A Lista") {
    duplicate(List('a, 'b, 'c, 'c, 'd)) should
      equal(List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
    duplicate(List('a)) should equal(List('a, 'a))
  }

}
