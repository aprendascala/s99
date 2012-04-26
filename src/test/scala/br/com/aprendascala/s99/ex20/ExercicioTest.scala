package br.com.aprendascala.s99.ex20;

import org.junit.{ Test, Assert }

import Exercicio._

class ExercicioTest {

  @Test
  def deveRemoverOsEnesimosElementosDaLista = {
    Assert.assertEquals((List('a, 'c, 'd), 'b),
      removeAt(1, List('a, 'b, 'c, 'd)))

    Assert.assertEquals((List(), 'a),
      removeAt(0, List('a)))
  }

}
