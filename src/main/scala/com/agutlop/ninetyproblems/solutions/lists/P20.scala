package com.agutlop.ninetyproblems.solutions.lists

import scala.annotation.tailrec

/**
  * P20 (*) Remove the Kth element from a list.
  * Return the list and the removed element in a Tuple. Elements are numbered from 0.
  * Example:
  * scala> removeAt(1, List('a, 'b, 'c, 'd))
  * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */
object P20 {

  def removeAt[A](k: Int, ls: List[A]): (List[A], A) = {
    if (k < ls.length) {
      val (prev, next) = ls.splitAt(k)
      (prev ::: next.tail, next.head)
    }
    else {
      throw new NoSuchElementException
    }
  }

  def removeAtRecursive[A](k: Int, ls: List[A]): (List[A], A) = {
    @tailrec
    def innerRemove(step: Int, prev: List[A], next: List[A]): (List[A], A) = {
      (step, prev, next) match {
        case (0, _, _) => (prev ::: next.tail, next.head)
        case (_, _, Nil) => throw new NoSuchElementException
        case (s, _, h :: tail) => innerRemove(s - 1, prev :+ h, tail)
      }
    }

    innerRemove(k, List(), ls)
  }


}
