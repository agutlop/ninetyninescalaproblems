package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P01._
import org.scalatest.FunSuite

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
