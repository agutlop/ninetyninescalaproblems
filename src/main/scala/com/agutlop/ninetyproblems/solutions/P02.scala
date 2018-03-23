package com.agutlop.ninetyproblems.solutions

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
}
