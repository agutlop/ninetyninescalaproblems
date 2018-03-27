package com.agutlop.ninetyproblems.solutions.lists

import scala.annotation.tailrec

/**
  * P16 (**) Drop every Nth element from a list.
  * Example:
  * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */
object P16 {

  def dropRecursive[A](n: Int, ls: List[A]): List[A] = {
    @tailrec
    def innerDrop(step: Int, previous: List[A], next: List[A]): List[A] = {
      next match {
        case Nil => previous.reverse
        case x :: tail => {
          if(step == n) innerDrop(1, previous, tail)
          else innerDrop(step + 1, x :: previous, tail)
        }
      }
    }
    innerDrop(1, List(), ls)
  }

}
