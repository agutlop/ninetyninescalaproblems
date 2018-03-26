package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P06._

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

