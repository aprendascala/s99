package br.com.aprendascala.s99.ex4;

import org.junit.Test;
import org.junit.Assert
import Exercicio._

class ExercicioTest {

  @Test
  def deveDevolverOTamanhoDaLista = {
    Assert.assertEquals(8, tamanho(List(1, 2, 3, 4, 5, 6, 7, 8)));
    Assert.assertEquals(6, tamanho(List(1, 2, 3, 4, 5, 6)));
    Assert.assertEquals(4, tamanho(List(5, 3, 2, 1)));
  }

}
