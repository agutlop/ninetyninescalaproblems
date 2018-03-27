package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P08._
import org.scalatest.FunSuite

class P08Test extends FunSuite {

  test("compress a list and an empty list") {
    assert(compress(List(1, 1, 1, 1, 1)) == List(1))
    assert(compress(List()) == List())
  }

}