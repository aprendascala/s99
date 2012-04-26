package br.com.aprendascala.s99.ex13;

import org.junit.Test;
import org.junit.Assert

import Exercicio._

class ExercicioTest {

  @Test
  def deveEmpacotarALista = {
    Assert.assertEquals(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)),
      encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    Assert.assertEquals(List((1, 'a), (1, 'b), (1, 'c), (1, 'g)), encodeDirect(List('a, 'b, 'c, 'g)))
  }

}
