package aprendascala.s99

import aprendascala.ferramentas.Exercicios

class Exercicio08 extends Exercicios {

  def comprimir(list : List[Symbol]) = {
  }

  exercicio("Elimine elementos duplicados consecutivos de uma lista") {
    """
    Se a lista contem elementos repetidos eles devem ser trocados por
    uma única cópia do elemento. A ordem dos elementos não deve mudar.
    """

    comprimir(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List('a, 'b, 'c, 'a, 'd, 'e))
    comprimir(List('a, 'b, 'c, 'g)) should equal(List('a, 'b, 'c, 'g))
  }

}
