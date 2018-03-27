package com.agutlop.ninetyproblems.solutions.lists

import org.scalatest.FunSuite
import com.agutlop.ninetyproblems.solutions.lists.P19._

class P19Test extends FunSuite{

  test("slice a list by two indexes") {
    assert(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
    assert(rotate(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    assert(rotate(11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    assert(rotate(12, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a))
    assert(rotate(3, List()) == List() )

    assert(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
    assert(rotate(-13, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
    assert(rotate(-3, List()) == List() )

  }
}
