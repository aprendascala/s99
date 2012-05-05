package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio09 extends Exercicios {

  def empacotar(list : List[Symbol]) = {
  }

  exercicio("Deve Empacotar A Lista") {
    empacotar(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should
      equal(List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))

    empacotar(List('a, 'b, 'c, 'g)) should equal(List(List('a), List('b), List('c), List('g)))
  }

}
