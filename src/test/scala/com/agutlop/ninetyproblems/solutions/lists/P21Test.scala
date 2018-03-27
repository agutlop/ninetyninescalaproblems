package com.agutlop.ninetyproblems.solutions.lists

import org.scalatest.FunSuite
import com.agutlop.ninetyproblems.solutions.lists.P21._

class P21Test extends FunSuite{

  test("insert new element at K position") {
    assert(insertAt('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd))
    assert(insertAt('new, 7, List('a, 'b, 'c, 'd)) == List('a, 'b, 'c, 'd, 'new))
    assert(insertAt('new, 1, List()) == List('new))

    assert(insertAt2('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd))
    assert(insertAt2('new, 7, List('a, 'b, 'c, 'd)) == List('a, 'b, 'c, 'd, 'new))
    assert(insertAt2('new, 1, List()) == List('new))
  }

}
