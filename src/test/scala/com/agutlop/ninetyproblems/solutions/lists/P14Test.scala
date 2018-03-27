package com.agutlop.ninetyproblems.solutions.lists

import org.scalatest.FunSuite
import com.agutlop.ninetyproblems.solutions.lists.P14._

class P14Test extends FunSuite{

  test("encode a list and an empty list") {
    assert(duplicate(List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
    assert(duplicate(List()) == List())
  }

}
