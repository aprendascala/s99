package br.com.aprendascala.s99.ex21;

import org.junit.{ Test, Assert }

import Exercicio._

class ExercicioTest {

  @Test
  def deveRemoverOsEnesimosElementosDaLista = {
    Assert.assertEquals(List('a, 'new, 'b, 'c, 'd),
      insertAt('new, 1, List('a, 'b, 'c, 'd)))

    Assert.assertEquals(List('a, 'b, 'new, 'c, 'd),
      insertAt('new, 2, List('a, 'b, 'c, 'd)))

  }
}
