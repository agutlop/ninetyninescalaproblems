package com.agutlop.ninetyproblems.solutions.lists

import org.scalatest.FunSuite
import com.agutlop.ninetyproblems.solutions.lists.P18._

class P18Test extends FunSuite{

  test("slice a list by two indexes") {
    assert(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g))
    assert(slice(3, 7, List()) == List() )

    assert(sliceRecursive(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g))
    assert(sliceRecursive(3, 7, List()) == List() )
  }

  test("slice a list by two incorrect indexes") {
    assert(slice(8, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List())
    assert(slice(8, 7, List()) == List() )

    assert(sliceRecursive(4, 2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List())
    assert(sliceRecursive(4, 2, List()) == List() )
  }

}
