package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P10._
import org.scalatest.FunSuite

class P10Test extends FunSuite {

  test("encode a list and an empty list") {
    assert(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    assert(encode(List()) == List())
  }

}
