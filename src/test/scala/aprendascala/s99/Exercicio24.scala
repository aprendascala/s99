package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio24 extends Exercicios {

  def lotto(n : Int, max : Int) : List[Symbol] = {
    List()
  }

  exercicio("Deve Remover Os Enesimos Elementos Da Lista") {
    lotto(6, 49).size should equal(6)

    lotto(2, 1000).size should equal(2)
  }
}

