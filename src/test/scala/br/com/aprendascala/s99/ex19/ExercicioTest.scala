package br.com.aprendascala.s99.ex19;

import org.junit.{ Test, Assert }

import Exercicio._

class ExercicioTest {

  @Test
  def deveRemoverOsEnesimosElementosDaLista = {
    Assert.assertEquals(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c),
      rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    Assert.assertEquals(List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i),
      rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
