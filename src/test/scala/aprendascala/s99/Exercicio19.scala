package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio19 extends Exercicios {

  def rotate(n : Int, list : List[Symbol]) = {
  }

  exercicio("Rotacione uma lista N elementos para a esquerda") {
    rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should
      equal(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))

    rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should
      equal(List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }

}
