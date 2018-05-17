package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P23.randomSelectTailRec

/**
  * P24 (*) Lotto: Draw N different random numbers from the set 1..M.
  * Example:
  * scala> lotto(6, 49)
  * res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  */
object P24 {

  def lotto(n: Int, range: Int): List[Int] = {
    randomSelectTailRec(n, (1 to range).toList)
  }

}
