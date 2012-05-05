package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio23 extends Exercicios {

  def randomSelect(n : Int, list : List[Symbol]) : List[Symbol] = {
    List()
  }

  exercicio("Deve Remover Os Enesimos Elementos Da Lista") {
    randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)).size should equal(3)

    randomSelect(2, List('e, 'd, 'a)).size should equal(2)
  }
}

