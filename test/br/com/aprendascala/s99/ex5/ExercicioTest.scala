package br.com.aprendascala.s99.ex5;

import org.junit.Test;
import org.junit.Assert
import Exercicio._

class ExercicioTest {

  @Test
  def deveInverterALista = {
    Assert.assertEquals(List(8, 7, 6, 5, 4, 3, 2, 1), inverte(List(1, 2, 3, 4, 5, 6, 7, 8)));
    Assert.assertEquals(List(6, 5, 4, 3, 2, 1), inverte(List(1, 2, 3, 4, 5, 6)));
    Assert.assertEquals(List(1, 2, 3, 5), inverte(List(5, 3, 2, 1)));
  }

}
