package com.agutlop.ninetyproblems.solutions

import scala.annotation.tailrec

/**
  * P05 (*) Reverse a list.
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object P05 {

  def reverse[A](ls: List[A]) = ls.reverse

  def reverseRecursive[A](ls: List[A]): List[A] = {
    @tailrec
    def innerReverse(ls: List[A], revLs: List[A]): List[A] = ls match {
      case Nil => revLs
      case head :: tail => innerReverse(tail, head :: revLs)
    }
    innerReverse(ls, List())
  }

  def reverseFunctional[A](ls: List[A]): List[A] = ls.foldLeft(List[A]())((acc, cur) => cur :: acc)

}
