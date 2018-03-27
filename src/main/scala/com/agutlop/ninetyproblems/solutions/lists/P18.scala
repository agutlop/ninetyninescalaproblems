package com.agutlop.ninetyproblems.solutions.lists

import scala.annotation.tailrec

/**
  * P18 (**) Extract a slice from a list.
  * Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
  * Example:
  * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */
object P18 {

  def slice[A](i: Int, k: Int, ls: List[A]): List[A] = {
    ls.drop(i).take(k-i)
  }

  def sliceRecursive[A](i: Int, k: Int, ls: List[A]): List[A] = {
    @tailrec
    def innerSlice(st: Int, end: Int, left:List[A]): List[A] = {
      (st, end, left) match {
        case (_, _ , Nil) => Nil
        case (0, e, ls) => ls.take(e)
        case (s, e, h :: tail) => innerSlice(s - 1, e - 1, tail)
      }
    }
    innerSlice(i, k, ls)
  }

}
