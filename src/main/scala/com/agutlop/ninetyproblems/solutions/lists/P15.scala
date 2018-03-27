package com.agutlop.ninetyproblems.solutions.lists

object P15 {

  def duplicateN[A](times: Int, ls: List[A]): List[A] = ls.flatMap(e => (1 to times).map(_ => e))

}
