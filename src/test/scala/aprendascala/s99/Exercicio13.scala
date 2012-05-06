package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio13 extends Exercicios {

  def encodeDirect(list : List[Symbol]) = {
  }

  exercicio("Codificação Run-length de uma lista(solução direta)") {
    """
    Implemente a codificação run-length para compressão de dados diretamente. Ou seja, não 
    use métodos que você escreveu em outros exercícios. Faça todo o trabalho diretamente.
    """

    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should
      equal(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    encodeDirect(List('a, 'b, 'c, 'g)) should equal(List((1, 'a), (1, 'b), (1, 'c), (1, 'g)))
  }

}
