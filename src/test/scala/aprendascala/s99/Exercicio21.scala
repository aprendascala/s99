package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio21 extends Exercicios {

  def insertAt(s : Symbol, n : Int, list : List[Symbol]) = {
  }

  exercicio("Insira um elemento na posição dada da lista") {
    insertAt('new, 1, List('a, 'b, 'c, 'd)) should equal(List('a, 'new, 'b, 'c, 'd))

    insertAt('new, 2, List('a, 'b, 'c, 'd)) should equal(List('a, 'b, 'new, 'c, 'd))
  }
}
