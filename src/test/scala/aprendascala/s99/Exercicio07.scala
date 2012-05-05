package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio07 extends Exercicios {

  def achatar(list : List[Any]) = {
  }

  exercicio("Achate uma estrutura de listas aninhadas") {
    achatar(List(List(1, 1), 2, List(3, List(5, 8)))) should equal(List(1, 1, 2, 3, 5, 8))
    achatar(List(1, List(2, List(2, List(1))))) should equal(List(1, 2, 2, 1))
  }

}
