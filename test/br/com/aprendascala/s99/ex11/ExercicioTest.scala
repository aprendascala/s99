package br.com.aprendascala.s99.ex11;

import org.junit.Test;
import org.junit.Assert

import Exercicio._

class ExercicioTest {

  @Test
  def deveEmpacotarALista = {
    Assert.assertEquals(List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e)),
      encodeModificado(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    Assert.assertEquals(List('a, 'b, 'c, 'g), encodeModificado(List('a, 'b, 'c, 'g)))
  }

}
