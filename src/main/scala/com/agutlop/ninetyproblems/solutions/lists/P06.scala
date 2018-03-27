package com.agutlop.ninetyproblems.solutions.lists

import scala.annotation.tailrec

/**
  * P06 (*) Find out whether a list is a palindrome.
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  */
object P06 {

  def isPalindrome[A](ls: List[A]): Boolean = {
    ls == ls.reverse
  }

  @tailrec
  def isPalindromeRecursive[A](ls: List[A]): Boolean = {

    ls match {
      case h :: t :: Nil => h == t
      case _ :: Nil => true
      case Nil => true
      case h :: tail => h == tail.last && isPalindromeRecursive(tail.init)
    }
  }
}
