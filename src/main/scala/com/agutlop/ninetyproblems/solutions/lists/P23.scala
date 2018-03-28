package com.agutlop.ninetyproblems.solutions.lists

import scala.util.Random
import com.agutlop.ninetyproblems.solutions.lists.P20._

import scala.annotation.tailrec

/**
  * P23 (**) Extract a given number of randomly selected elements from a list.
  * Example:
  * scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  * res0: List[Symbol] = List('e, 'd, 'a)
  * Hint: Use the solution to problem P20
  */
object P23 {

  def randomSelect[A](num: Int, ls: List[A]): List[A] = {
    if (ls.length == 0 || num <= 0) Nil
    else {
      val (result, selected) = removeAtRecursive(Random.nextInt(ls.length), ls)
      selected :: randomSelect(num - 1, result)
    }
  }

  def randomSelectTailRec[A](num: Int, ls: List[A]): List[A] = {
    @tailrec
    def innerSelect(num: Int, rest: List[A], result: List[A]): List[A] = {
      if (num <= 0 || rest.length == 0) result
      else {
        val (newRest, selected) = removeAtRecursive(Random.nextInt(rest.length), rest)
        innerSelect(num-1, newRest, selected :: result)
      }
    }
    innerSelect(num, ls, List())
  }

}
