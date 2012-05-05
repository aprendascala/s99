package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio18 extends Exercicios {

  def slice(begin : Int, end : Int, list : List[Symbol]) = {
  }

  exercicio("Deve Remover Os Enesimos Elementos Da Lista") {

    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should
      equal(List('d, 'e, 'f, 'g))

    slice(1, 2, List('a, 'b, 'c)) should equal(List('b))
  }

}
