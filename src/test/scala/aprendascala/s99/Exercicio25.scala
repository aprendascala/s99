package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio25 extends Exercicios {

  def randomPermute(list : List[Symbol]) = {
    List()
  }

  exercicio("Gere uma permutação aleatória dos elementos de uma lista") {
    randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)).size should equal(6)
  }
}

