package com.agutlop.ninetyproblems.solutions.lists

import com.agutlop.ninetyproblems.solutions.lists.P09._

/**
  * P11 (*) Modified run-length encoding.
  * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
  * Example:
  * scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  */
object P11 {

  def encodeModified[A](ls: List[A]): List[Any] = {
    pack(ls).map{
      l => if (l.length > 1) {
        (l.length, l.head)
      }
      else {
        l.head
      }
    }
  }

}
