package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P07._
import org.scalatest.FunSuite

class P07Test extends FunSuite {

  test("flatten a list") {
    assert(
      flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8)
      )
  }
}
