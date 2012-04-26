package br.com.aprendascala.s99.ex14;

import org.junit.Test;
import org.junit.Assert

import Exercicio._

class ExercicioTest {

  @Test
  def deveDuplicarALista = {
    Assert.assertEquals(List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd),
      duplicate(List('a, 'b, 'c, 'c, 'd)))
    Assert.assertEquals(List('a, 'a), duplicate(List('a)))
  }

}
