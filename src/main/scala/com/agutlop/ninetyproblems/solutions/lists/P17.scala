package com.agutlop.ninetyproblems.solutions.lists

/**
  * P17 (*) Split a list into two parts.
  * The length of the first part is given. Use a Tuple for your result.
  * Example:
  * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  */
object P17 {

  def split[A](n: Int, ls: List[A]): (List[A], List[A]) = {
    def innerSplit(step: Int, prev: List[A], next: List[A]): (List[A], List[A]) = {
      (step, next) match {
        case (_, Nil) => (prev.reverse, next)
        case (0, _) => (prev.reverse, next)
        case (s, h :: tail)=> innerSplit(s - 1, h :: prev, tail)
      }
    }
    innerSplit(n, List(), ls)
  }

}
