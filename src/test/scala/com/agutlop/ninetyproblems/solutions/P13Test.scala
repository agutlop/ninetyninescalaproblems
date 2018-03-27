package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P13._

class P13Test extends FunSuite {

  test("encode a list and an empty list") {
    assert(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    assert(encodeDirectWithSpan(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))

    assert(encodeDirect(List()) == List())
    assert(encodeDirectWithSpan(List()) == List())
  }

}
