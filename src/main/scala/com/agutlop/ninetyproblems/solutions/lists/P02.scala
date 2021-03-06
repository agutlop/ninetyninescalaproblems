package com.agutlop.ninetyproblems.solutions.lists

import scala.annotation.tailrec

/**
  * P02 (*) Find the last but one element of a list.
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */
object P02 {
  def penultimate[A](ls: List[A]): A = ls match {
    case Nil => throw new NoSuchElementException
    case ls:List[A] => ls.init.last
  }

  @tailrec
  def penultimateRecursive[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimateRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}
