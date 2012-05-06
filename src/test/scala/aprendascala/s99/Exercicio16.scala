package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio16 extends Exercicios {

  def removeN(n : Int, list : List[Symbol]) = {
  }

  exercicio("Remova Os Enesimos Elementos Da Lista") {
    removeN(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should
      equal(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    removeN(1, List('a)) should equal(List())
  }

}
