package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P05._

class P05Test extends FunSuite {

  test("reverse a list") {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
    assert(reverseRecursive(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }

  test("reverse one element list") {
    assert(reverse(List(1)) == List(1))
    assert(reverseRecursive(List(1)) == List(1))
  }

  test("reverse an empty list") {
    assert(reverse(List()) == List())
    assert(reverseRecursive(List()) == List())
  }

}
