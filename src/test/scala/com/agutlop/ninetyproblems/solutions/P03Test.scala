package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P03._

class P03Test extends FunSuite {

  test("aleatory element of a list") {
    assert(nth(1, List(1, 2, 3)) == 2)
  }

  test("index not in length of a list") {
    assertThrows[NoSuchElementException] {
      nth(3, List(1))
    }
  }

  test("nth of an empty list") {
    assertThrows[NoSuchElementException] {
      nth(0, List())
    }
  }
}
