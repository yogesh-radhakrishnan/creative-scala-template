
sealed trait Shapes {

  def sides: Double

  def area: Double

  def perimeter: Double

  def color:Color

}

case class Circle(val radius: Double, val color: Color) extends Shapes {

  val sides = 0.0

  val area = math.Pi * radius * radius

  val perimeter = 2 * math.Pi * radius

}

sealed trait Rectangular extends Shapes {
  def len: Double

  def bre: Double

  val sides = 4.0

  val area = len * bre

  val perimeter = 2 * (len + bre)
}

case class Square(val side: Double, val color: Color) extends Rectangular {
  val len = side
  val bre = side
}

case class Rectangle(val len: Double, val bre: Double, val color: Color) extends Rectangular

object Draw {

  def apply(s: Shapes): String = {
    s match {
      case Circle(a, c) => s"this is a circle with radius $a and color ${Draw(c)}"
      case Rectangle(l, b, c) => s"this is a rectangle with len $l, bre $b and color ${Draw(c)}"
      case Square(a, c) => s"this is a square with one side $a and color ${Draw(c)}"
      case _ => "no shape"
    }
  }

  def apply(c: Color) = {
    c match {
      case Red => "red"
      case Yellow => "yellow"
      case Pink => "pink"
      case color => s"${color.tone} tone"
    }
  }
}

trait Color {
  def R: Int

  def G: Int

  def B: Int

  def tone: String = {
    if (R >= 50 || G >= 50 || B >= 50) {
      "Dark"
    }
    else {
      "Light"
    }
  }

  def isDark = tone == "Dark"

  def isLight = !isDark
}

case object Red extends Color {
  val R: Int = 100

  val G: Int = 0

  val B: Int = 0
}

case object Yellow extends Color {
  val R: Int = 100

  val G: Int = 100

  val B: Int = 0
}

case object Pink extends Color {
  val R: Int = 100

  val G: Int = 0

  val B: Int = 100
}

case class CustomColor(val R: Int, val G: Int, val B: Int) extends Color

object testShape {
  def main(args: Array[ String ]): Unit = {
    println(Draw(Rectangle(3, 4, CustomColor(40, 40, 30))))
  }
}
