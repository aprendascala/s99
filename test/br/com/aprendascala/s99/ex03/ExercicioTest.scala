package br.com.aprendascala.s99.ex03;

import org.junit.{Test, Assert}

import Exercicio._

class ExercicioTest {

  @Test
  def deveDevolverOEnesimoElementoDaLista = {
    Assert.assertEquals(3, enesimo(2, List(1, 2, 3, 4, 5, 6, 7, 8)));
    Assert.assertEquals(6, enesimo(5, List(1, 2, 3, 4, 5, 6)));
    Assert.assertEquals(1, enesimo(3, List(5, 3, 2, 1)));
  }

}