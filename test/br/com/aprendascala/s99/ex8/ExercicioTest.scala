package br.com.aprendascala.s99.ex8;

import org.junit.Test;
import org.junit.Assert
import Exercicio._

class ExercicioTest {

  @Test
  def deveComprimirALista = {
    Assert.assertEquals(List('a, 'b, 'c, 'a, 'd, 'e), comprimir(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    Assert.assertEquals(List('a, 'b, 'c, 'g), comprimir(List('a, 'b, 'c, 'g)))
  }

}
