package br.com.aprendascala.s99.ex22;

import org.junit.{ Test, Assert }

import Exercicio._

class ExercicioTest {

  @Test
  def deveRemoverOsEnesimosElementosDaLista = {
    Assert.assertEquals(List(4, 5, 6, 7, 8, 9),
      range(4, 9))

    Assert.assertEquals(List(2, 3, 4, 5, 6, 7, 8, 9, 10),
      range(2, 10))

  }
}
