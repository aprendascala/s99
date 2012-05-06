package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio22 extends Exercicios {

  def range(begin : Int, end : Int) = {
  }

  exercicio("Crie uma lista contendo todos os elementos os números passados") {
    range(4, 9) should equal(List(4, 5, 6, 7, 8, 9))

    range(2, 10) should equal(List(2, 3, 4, 5, 6, 7, 8, 9, 10))
  }
}
