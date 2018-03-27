package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P03._
import org.scalatest.FunSuite

class P03Test extends FunSuite {

  test("aleatory element of a list") {
    assert(nth(1, List(1, 2, 3)) == 2)
    assert(nthRecursive(1, List(1, 2, 3)) == 2)

  }

  test("index not in length of a list") {
    assertThrows[NoSuchElementException] {
      nth(3, List(1))
      nthRecursive(3, List(1))
    }
  }

  test("nth of an empty list") {
    assertThrows[NoSuchElementException] {
      nth(0, List())
      nthRecursive(0, List())
    }
  }
}
