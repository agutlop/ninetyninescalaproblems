package com.agutlop.ninetyproblems.solutions

import java.util.NoSuchElementException

import scala.util.{Failure, Success, Try}

/**
  * P03 (*) Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  * Example:
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */
object P03 {

  def nth[A](nth: Int, ls: List[A]): A = {
    Try(ls(nth)) match {
      case Success(n) => n
      case Failure(_) => throw new NoSuchElementException
    }
  }

}
