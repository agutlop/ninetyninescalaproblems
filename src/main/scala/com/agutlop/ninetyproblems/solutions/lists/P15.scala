package com.agutlop.ninetyproblems.solutions.lists

/**
  * P15 (**) Duplicate the elements of a list a given number of times.
  * Example:
  * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  */
object P15 {

  def duplicateN[A](times: Int, ls: List[A]): List[A] = ls.flatMap(e => (1 to times).map(_ => e))

}
