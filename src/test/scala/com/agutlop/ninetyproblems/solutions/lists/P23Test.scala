package com.agutlop.ninetyproblems.solutions.lists

import org.scalatest.FunSuite
import com.agutlop.ninetyproblems.solutions.lists.P23._

class P23Test extends FunSuite {

  test("Select random elements from a list") {
    assert(randomSelect(2, List()).length == 0)
    assert(randomSelect(2, List(1, 2, 3, 4, 5, 6, 7)).length == 2)
    assert(randomSelect(4, List(1, 2, 3, 4, 5, 6, 7)).length == 4)

    assert(randomSelectTailRec(2, List()).length == 0)
    assert(randomSelectTailRec(2, List(1, 2, 3, 4, 5, 6, 7)).length == 2)
    assert(randomSelectTailRec(4, List(1, 2, 3, 4, 5, 6, 7)).length == 4)

  }
}
