package br.com.aprendascala.s99.ex2;

import org.junit.Test;
import org.junit.Assert
import Exercicio._

class ExercicioTest {

  @Test
  def deveDevolverOPenultimoElementoDaLista = {
    Assert.assertEquals(7, penultimo(List(1, 2, 3, 4, 5, 6, 7, 8)));
    Assert.assertEquals(5, penultimo(List(1, 2, 3, 4, 5, 6)));
    Assert.assertEquals(1, penultimo(List(1, 2)));
  }

}
