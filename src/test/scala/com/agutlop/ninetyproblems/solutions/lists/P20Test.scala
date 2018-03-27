package com.agutlop.ninetyproblems.solutions.lists

import org.scalatest.FunSuite
import com.agutlop.ninetyproblems.solutions.lists.P20._

class P20Test extends FunSuite {

  test("remove Kth element") {
    assert(removeAt(1, List('a, 'b, 'c, 'd)) == (List('a, 'c, 'd),'b))
    assert(removeAtRecursive(1, List('a, 'b, 'c, 'd)) == (List('a, 'c, 'd),'b))

  }

  test("remove Kth element out of bound") {
    assertThrows[NoSuchElementException] {
      removeAt(5, List('a, 'b, 'c, 'd))
    }
    assertThrows[NoSuchElementException] {
      removeAtRecursive(5, List('a, 'b, 'c, 'd))
    }
  }

  test("remove Kth element of an empty list") {
    assertThrows[NoSuchElementException] {
      removeAt(5, List())
    }
    assertThrows[NoSuchElementException] {
      removeAtRecursive(5, List())
    }
  }

}
