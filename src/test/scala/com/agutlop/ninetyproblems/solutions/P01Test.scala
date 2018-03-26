package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P01._

class P01Test extends FunSuite {

  test("last element of a list") {
    assert(last(List(1, 2, 3)) == 3)
    assert(lastRecursive(List(1, 2, 3)) == 3)
  }

  test("last element of a one element list") {
    assert(last(List(1)) == 1)
    assert(lastRecursive(List(1)) == 1)
  }

  test("last element of an empty element list") {
    assertThrows[NoSuchElementException] {
      last(List())
      lastRecursive(List())
    }
  }
}
