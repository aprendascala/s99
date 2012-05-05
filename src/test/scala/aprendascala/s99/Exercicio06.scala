package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio06 extends Exercicios {

  def ehPalindromo(list : List[Int]) : Boolean = {
    false
  }

  exercicio("Descubra se a lista é um palindromo") {
    ehPalindromo(List(1, 2, 3, 2, 1)) should equal(true)
    ehPalindromo(List(1, 2, 2, 1)) should equal(true)
    ehPalindromo(List(1)) should equal(true)
    ehPalindromo(List(1, 2, 3)) should equal(false)
  }

}
