package br.com.aprendascala.s99.ex1;

import org.junit.Test;
import org.junit.Assert
import Exercicio2._

class Exercicio1Test {

  @Test
  def deveDevolverOUltimoElementoDaLista = {
    Assert.assertEquals(8, ultimo(List(1, 2, 3, 4, 5, 6, 7, 8)));
    Assert.assertEquals(6, ultimo(List(1, 2, 3, 4, 5, 6)));
    Assert.assertEquals(1, ultimo(List(1)));
  }

}
