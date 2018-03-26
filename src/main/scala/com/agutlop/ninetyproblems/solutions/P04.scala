package com.agutlop.ninetyproblems.solutions

import scala.annotation.tailrec

/**
  * P04 (*) Find the number of elements of a list.
  * Example:
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  */
object P04 {

  def length[A](ls: List[A]): Int = ls.length

  def lengthRecursive[A](ls: List[A]): Int = {

    @tailrec
    def innerLength(num: Int, ls:List[A]): Int = ls match {
      case Nil => num
      case _ :: tail => innerLength(num + 1, tail)
    }

    innerLength(0, ls)

  }

}
