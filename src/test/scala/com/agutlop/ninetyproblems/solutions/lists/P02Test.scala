package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P02._
import org.scalatest.FunSuite

class P02Test extends FunSuite {

  test("penultimate element of a list") {
    assert(penultimate(List(1, 2, 3)) == 2)
    assert(penultimateRecursive(List(1, 2, 3)) == 2)
  }

  test("last element of a one element list") {
    assertThrows[NoSuchElementException] {
      penultimate(List(1))
      penultimateRecursive(List(1))
    }
  }

  test("last element of an empty element list") {
    assertThrows[NoSuchElementException] {
      penultimate(List())
      penultimateRecursive(List())
    }
  }
}
