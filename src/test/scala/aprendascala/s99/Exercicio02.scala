package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio02 extends Exercicios {

  def penultimo(list : List[Int]) = {}

  exercicio("Encontre o penultimo elemento da lista") {
    penultimo(List(1, 2, 3, 4, 5, 6, 7, 8)) should equal(7)
    penultimo(List(1, 2, 3, 4, 5, 6)) should equal(5)
    penultimo(List(1, 2)) should equal(1)
  }
}