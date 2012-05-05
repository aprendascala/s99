package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio05 extends Exercicios {

  def inverte(list : List[Int]) = {
  }

  exercicio("Deve Inverter A Lista") {
    inverte(List(1, 2, 3, 4, 5, 6, 7, 8)) should equal(List(8, 7, 6, 5, 4, 3, 2, 1))
    inverte(List(1, 2, 3, 4, 5, 6)) should equal(List(6, 5, 4, 3, 2, 1))
    inverte(List(5, 3, 2, 1)) should equal(List(1, 2, 3, 5))
  }

}
