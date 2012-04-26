package br.com.aprendascala.s99.ex9;

import org.junit.Test;
import org.junit.Assert
import Exercicio._

class ExercicioTest {

  @Test
  def deveEmpacotarALista = {
    Assert.assertEquals(List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)),
      empacotar(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    Assert.assertEquals(List(List('a), List('b), List('c), List('g)), empacotar(List('a, 'b, 'c, 'g)))
  }

}
