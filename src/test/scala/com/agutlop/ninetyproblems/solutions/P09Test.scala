package com.agutlop.ninetyproblems.solutions

import org.scalatest.FunSuite
import P09._

class P09Test extends FunSuite {

  test("pack a list and an empty list") {
    assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    assert(pack(List()) == List())
  }

}