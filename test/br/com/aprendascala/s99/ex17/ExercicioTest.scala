package br.com.aprendascala.s99.ex17;

import org.junit.Test;
import org.junit.Assert

import Exercicio._

class ExercicioTest {

  @Test
  def deveRemoverOsEnesimosElementosDaLista = {
    Assert.assertEquals(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k),
      removeN(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    Assert.assertEquals(List(), removeN(1, List('a)))
  }

}
