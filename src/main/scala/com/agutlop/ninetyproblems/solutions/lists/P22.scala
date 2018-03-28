package com.agutlop.ninetyproblems.solutions.lists

import scala.annotation.tailrec

/**
  * P22 (*) Create a list containing all integers within a given range.
  * Example:
  * scala> range(4, 9)
  * res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */
object P22 {

  def range(start: Int, end: Int): List[Int] = {
    if (end >= start) (start to end).toList
    else Nil
  }

  def rangeRecursive(start: Int, end: Int): List[Int] = {
    if (end < start) Nil
    else start :: rangeRecursive(start + 1, end)
  }

  def rangeTailRecursive(start: Int, end: Int): List[Int] = {
    @tailrec
    def innerRange(current: Int, result: List[Int]): List[Int] = {
      if(current > end) result
      else innerRange(current + 1, result :+ current )
    }
    innerRange(start, List())
  }
}
