
sealed trait DivisionResult

final case class Finite(val result: Double) extends DivisionResult

case object InFinite extends DivisionResult

case object divide {
  def apply(num: Int, dem: Int): DivisionResult = {
    if (dem == 0) InFinite else Finite(num / dem)
  }
}


object TestDivide {
  def main(args: Array[ String ]): Unit = {
    divide(1, 0) match {
      case Finite(value) => println(value)
      case InFinite => println("infinite value")
    }
  }
}
