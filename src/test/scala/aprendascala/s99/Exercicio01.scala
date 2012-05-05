package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio01 extends Exercicios {

  def ultimo(list : List[Int]) = {}

  exercicio("Encontre o último elemento da lista") {
    ultimo(List(1, 2, 3, 4, 5, 6, 7, 8)) should equal(8)
    ultimo(List(1, 2, 3, 4, 5, 6)) should equal(6)
    ultimo(List(1)) should equal(1)
  }

}
