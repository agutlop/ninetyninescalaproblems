package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P02._

class P02Test extends FunSuite {

  test("penultimate element of a list") {
    assert(penultimate(List(1, 2, 3)) == 2)
  }

  test("last element of a one element list") {
    assertThrows[NoSuchElementException] {
      penultimate(List(1))
    }
  }

  test("last element of an empty element list") {
    assertThrows[NoSuchElementException] {
      penultimate(List())
    }
  }
}
