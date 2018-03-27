package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P12._

class P12Test extends FunSuite {

  test("encode a list and an empty list") {
    assert(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    assert(decode(List()) == List())
  }

}
