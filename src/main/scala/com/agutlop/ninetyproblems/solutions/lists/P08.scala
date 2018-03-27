package com.agutlop.ninetyproblems.solutions.lists

/**
  * P08 (**) Eliminate consecutive duplicates of list elements.
  * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  * Example:
  * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
object P08 {

  def compress[A](ls: List[A]): List[A] = ls match {
    case Nil => ls
    case _ => ls.foldLeft(List[A](ls.head))( (a, c) => if(a.head != c) c +: a else a)
  }


}
