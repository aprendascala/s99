package br.com.aprendascala.s99.ex12;

import org.junit.Test;
import org.junit.Assert

import Exercicio._

class ExercicioTest {

  @Test
  def deveDecodarALista = {
    Assert.assertEquals(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e),
      decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
    Assert.assertEquals(List('a, 'b, 'c, 'g), decode(List((1, 'a), (1, 'b), (1, 'c), (1, 'g))))
  }

}
