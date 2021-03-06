package com.agutlop.ninetyproblems.solutions.lists

/**
  * P19 (**) Rotate a list N places to the left.
  * Examples:
  * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  */
object P19 {

  def rotate[A](pos: Int, ls: List[A]): List[A] = {
    if (!ls.isEmpty) {
      val norm = normalizeRotation(pos, ls.length)
      ls.drop(norm) ::: ls.take(norm)
    }
    else {
      ls
    }
  }

  def normalizeRotation(r: Int, length: Int): Int = {
    if(r < 0) length + (r % length)
    else r % length
  }


  // direct implementation
  def rotate2[A](r: Int, ls: List[A]): List[A] = {
    val norm = if (ls.isEmpty) 0 else r % ls.length
    if (norm < 0) rotate2(ls.length + norm, ls)
    else ls.drop(norm) ::: ls.take(norm)
  }
}
