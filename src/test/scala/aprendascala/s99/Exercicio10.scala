package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio10 extends Exercicios {

  def encode(list : List[Symbol]) = {
  }

  exercicio("Codificação Run-length de uma lista") {
    """
    Use o resultado do Exercício 09 para implementear a codificação run-length para 
    compressão de dados. Elementos duplicados consecutivos são encodados como Tuplas (N, E)
    onde N é o número de duplicatas do elemento E
    """

    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should
      equal(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    encode(List('a, 'b, 'c, 'g)) should equal(List((1, 'a), (1, 'b), (1, 'c), (1, 'g)))
  }

}
