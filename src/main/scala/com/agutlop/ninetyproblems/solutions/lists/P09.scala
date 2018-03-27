package com.agutlop.ninetyproblems.solutions.lists

import scala.util.Try


/**
  * P09 (**) Pack consecutive duplicates of list elements into sublists.
  * If a list contains repeated elements they should be placed in separate sublists.
  * Example:
  * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
object P09 {

  def pack[A](ls: List[A]): List[List[A]] = {

    def packElements(ls: List[A]): List[A] = Try(ls.takeWhile(_ == ls.head)).getOrElse(Nil)

    def innerPack(ls: List[A], result: List[List[A]]): List[List[A]] =
      ls match {
        case Nil => result
        case _ => innerPack(ls.dropWhile(_ == ls.head), result :+ packElements(ls))
      }

    innerPack(ls, List[List[A]]())
  }

}
