package br.com.aprendascala.s99.ex7;

import org.junit.Test;
import org.junit.Assert
import Exercicio._

class ExercicioTest {

  @Test
  def deveAchatarALista = {
    Assert.assertEquals(List(1, 1, 2, 3, 5, 8), achatar(List(List(1, 1), 2, List(3, List(5, 8)))));
    Assert.assertEquals(List(1, 2, 2, 1), achatar(List(1, List(2, List(2, List(1))))));
  }

}
