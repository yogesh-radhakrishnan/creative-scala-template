

object Calc {

  def square(number: Double): Double = {
    number * number
  }

  def cube(number: Double): Double = {
    number * square(number)
  }
}

object Calc2 {

  def square(number: Double): Double = {
    number * number
  }

  def cube(number: Double): Double = {
    number * square(number)
  }

  def square(number: Int): Int = {
    number * number
  }

  def cube(number: Int): Int = {
    number * square(number)
  }

  def main(args: Array[ String ]) = {
    assert(square(-2) == 4)
    assert(square(2) == 4)
    assert(square(3.0) == 9.0)
  }

}
