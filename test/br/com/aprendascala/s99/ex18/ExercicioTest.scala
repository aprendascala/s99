package br.com.aprendascala.s99.ex18;

import org.junit.{Test, Assert}

import Exercicio._

class ExercicioTest {

  @Test
  def deveRemoverOsEnesimosElementosDaLista = {
    Assert.assertEquals((List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)),
      split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    Assert.assertEquals((List('a), List('b)), split(1, List('a, 'b)))
  }

}
