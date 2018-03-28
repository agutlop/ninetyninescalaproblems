package com.agutlop.ninetyproblems.solutions.lists

import org.scalatest.FunSuite
import com.agutlop.ninetyproblems.solutions.lists.P22._

class P22Test extends FunSuite {

  test("Creating a correct list of int from a range") {
    assert(range(1, 3) == List(1, 2 , 3))
    assert(rangeRecursive(1, 3) == List(1, 2 , 3))
    assert(rangeTailRecursive(1, 3) == List(1, 2 , 3))

  }


}
