


object testOrdering {
  def main(args: Array[ String ]): Unit = {

    implicit val absOrdering = Ordering.fromLessThan[Int](math.abs(_) < math.abs(_))

    assert(List(-4, -1, 0, 2, 3).sorted == List(0, -1, 2, 3, -4))
    assert(List(-4, -3, -2, -1).sorted == List(-1, -2, -3, -4))
  }
}
