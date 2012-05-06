package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio24 extends Exercicios {

  def lotto(n : Int, m : Int) = {
    List()
  }

  exercicio("Sorteio: Escolha N elementos aleatórios diferentes do conjunto 1..M") {
    lotto(6, 49).size should equal(6)

    lotto(2, 1000).size should equal(2)
  }
}

