sealed trait LinkedList1[ A ] {

  //  def length: Int = {
  //    this match {
  //      case End() => 0
  //      case Pair(h, tail) => 1 + tail.length
  //    }
  //  }

  def contains(value: A): Boolean = {
    this match {
      case End() => false
      case Pair(h, t) => h == value || t.contains(value)
    }

  }

  def fold[ B ](end: B, f: (A, B) => B): B = {
    this match {
      case End() => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }
  }

//  def length: Int = fold(0, (_, tl) => 1 + tl)

//  def sum: Int = fold[Int](0, (head, tl) => head + tl)
//
//  def product: Int = fold(0, (head, tl) => head * tl)
//
//
//  def double: LinkedList1[ Int ] =
//    fold[ LinkedList1[ Int ] ](End, (hd, tl) => Pair(hd * 2, tl))

  //  def double: LinkedList1[A] = {
  //    this match {
  //      case End(value) => End(value * 2)
  //      case Pair(h, t) => Pair(h * 2, t.double)
  //    }
  //  }
}

final case class End[ A ]() extends LinkedList1[ A ]

final case class Pair[ A ](head: A, tail: LinkedList1[ A ]) extends LinkedList1[ A ]

object testLinkedList1 {
  def main(args: Array[ String ]): Unit = {
//    val example = Pair(1, Pair(2, Pair(3, End[ Int ])))
//    assert(example.length == 3)
//    assert(example.tail.length == 2)
//    assert(End().length == 0)

    val example2 = Pair(1, Pair(2, Pair(3, End())))
    assert(example2.contains(3) == true)
    assert(example2.contains(4) == false)
    assert(End().contains(0) == false)

    //    assert(example.double == Pair(2, Pair(4, Pair(6, End))))
    //    assert(example.tail.double == Pair(4, Pair(6, End)))
    //    assert(End.double == End)
  }
}
