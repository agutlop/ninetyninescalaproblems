package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P11._

class P11Test extends FunSuite {


  test("encode a list and an empty list") {
    assert(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
    assert(encodeModified(List()) == List())
  }
}
