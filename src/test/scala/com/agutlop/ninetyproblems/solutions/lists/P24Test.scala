package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P24._
import org.scalatest.FunSuite

class P24Test extends FunSuite{

  test("Select random elements from a range") {
    assert(lotto(2, 0).length == 0)
    assert(lotto(2, 22).length == 2)
    assert(lotto(4, 3333).length == 4)
  }

  test("Elements must be in range") {
    assert(checkRange(2, lotto(2, 0)))
    assert(checkRange(22, lotto(2, 22)))
    assert(checkRange(333, lotto(111, 333)))

  }

  test("Elements must be in differents") {
    assert(checkUnique(lotto(2, 0)))
    assert(checkUnique(lotto(2, 22)))
    assert(checkUnique(lotto(111, 333)))

  }


  def checkRange(m: Int, ls: List[Int]): Boolean = {
    val range = (1 to m)
    ls.forall(x => range.contains(x))
  }

  def checkUnique(ls: List[Int]): Boolean = {
    ls.length == ls.toSet.size
  }

}
