package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P04._
import org.scalatest.FunSuite

class P04Test extends FunSuite {

  test("length of a list with elements") {
    assert(length(List(1, 2, 3)) == 3)
    assert(lengthRecursive(List(1, 2, 3)) == 3)
  }

  test("length of an empty list") {
    assert(length(List()) == 0)
    assert(lengthRecursive(List()) == 0)
  }

}
