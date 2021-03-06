package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P05._
import org.scalatest.FunSuite

class P05Test extends FunSuite {

  test("reverse a list") {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
    assert(reverseRecursive(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
    assert(reverseFunctional(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }

  test("reverse one element list") {
    assert(reverse(List(1)) == List(1))
    assert(reverseRecursive(List(1)) == List(1))
    assert(reverseFunctional(List(1)) == List(1))
  }

  test("reverse an empty list") {
    assert(reverse(List()) == List())
    assert(reverseRecursive(List()) == List())
    assert(reverseFunctional(List()) == List())
  }

}
