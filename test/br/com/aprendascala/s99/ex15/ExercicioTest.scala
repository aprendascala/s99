package br.com.aprendascala.s99.ex15;

import org.junit.Test;
import org.junit.Assert

import Exercicio._

class ExercicioTest {

  @Test
  def deveEmpacotarALista = {
    Assert.assertEquals(List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd),
      duplicateN(3, List('a, 'b, 'c, 'c, 'd)))

    Assert.assertEquals(List('a), duplicateN(1, List('a)))
  }

}
