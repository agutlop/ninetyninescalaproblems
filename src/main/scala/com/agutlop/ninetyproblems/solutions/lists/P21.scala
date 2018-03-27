package com.agutlop.ninetyproblems.solutions.lists

/**
  * P21 (*) Insert an element at a given position into a list.
  * Example:
  * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  * res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */
object P21 {

  def insertAt[A](element: A, index: Int, ls: List[A]): List[A] = {
    ls.take(index) ::: element :: ls.takeRight(ls.length-index)
  }

  def insertAt2[A](element: A, index: Int, ls: List[A]): List[A] = {
    ls.splitAt(index) match {
      case (prev, last) => prev ::: element :: last
    }
  }

}
