package br.com.aprendascala.s99.ex06;

import org.junit.{Test, Assert}

import Exercicio._

class ExercicioTest {

  @Test
  def deveVerificarSeAListaEhUmPalidromo = {
    Assert.assertTrue(ehPalindromo(List(1, 2, 3, 2, 1)));
    Assert.assertTrue(ehPalindromo(List(1, 2, 2, 1)));
    Assert.assertTrue(ehPalindromo(List(1)));
    Assert.assertFalse(ehPalindromo(List(1, 2, 3)));
  }

}
