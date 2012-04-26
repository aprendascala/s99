package br.com.aprendascala.s99.ex18;

import org.junit.{ Test, Assert }

import Exercicio._

class ExercicioTest {

  @Test
  def deveRemoverOsEnesimosElementosDaLista = {
    Assert.assertEquals(List('d, 'e, 'f, 'g),
      slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    Assert.assertEquals(List('b), slice(1, 2, List('a, 'b, 'c)))
  }

}
