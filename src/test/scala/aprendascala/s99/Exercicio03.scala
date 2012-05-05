package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio03 extends Exercicios {

  def enesimo(n : Int, list : List[Int]) = {}

  exercicio("Encontre o enésimo elemento da lista") {
    enesimo(2, List(1, 2, 3, 4, 5, 6, 7, 8)) should equal(3)
    enesimo(5, List(1, 2, 3, 4, 5, 6)) should equal(6)
    enesimo(3, List(5, 3, 2, 1)) should equal(1)
  }

}
