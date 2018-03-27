package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P08._

class P08Test extends FunSuite {

  test("compress a list and an empty list") {
    assert(compress(List(1, 1, 1, 1, 1)) == List(1))
    assert(compress(List()) == List())
  }

}