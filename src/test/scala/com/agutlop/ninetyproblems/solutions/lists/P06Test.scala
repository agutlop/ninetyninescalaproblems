package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P06._
import org.scalatest.FunSuite

class P06Test extends FunSuite {

  test("palindrome with a list") {
    assert(isPalindrome(List(1, 2, 3, 2, 1)) == true)
    assert(isPalindromeRecursive(List(1, 2, 3, 2, 1)) == true)
    assert(isPalindrome(List(1, 2)) == false)
    assert(isPalindromeRecursive(List(1, 2)) == false)
  }

  test("palindrome with an empty list") {
    assert(isPalindrome(List()) == true)
    assert(isPalindromeRecursive(List()) == true)

  }

}

