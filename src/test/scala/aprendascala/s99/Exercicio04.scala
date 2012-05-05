package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio04 extends Exercicios {

  def tamanho(list : List[Int]) = {
  }

  exercicio("Encontre o numero de elementos da lista") {
    tamanho(List(1, 2, 3, 4, 5, 6, 7, 8)) should equal(8)
    tamanho(List(1, 2, 3, 4, 5, 6)) should equal(6)
    tamanho(List(5, 3, 2, 1)) should equal(4)
  }

}
