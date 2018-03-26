package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P07._

class P07Test extends FunSuite {

  test("flatten a list") {
    assert(
      flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8)
      )
  }
}
