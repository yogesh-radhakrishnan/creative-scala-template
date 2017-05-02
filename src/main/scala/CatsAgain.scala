
trait Feline {
  def color: String

  def sound: String = {
    this match {
      case c: Cat => "meow"
      case _ => "roar"
    }
  }

}

case class Cat(color: String, food: String) extends Feline

case class Lion(color: String, maneSize: Int) extends Feline

case class Tiger(color: String) extends Feline

object TestCat {

  def main(args: Array[ String ]) = {
    val Henderson = Cat("Ginger", "Chips")
    val Oswald = Cat("Black", "Milk")
    val Quentin = Cat("Tabby and white", "Curry")
    println(Tiger("yellow").sound)
  }

  object ChipShop {

    def WillServe(cat: Cat): Boolean = {

      cat match {
        case Cat(_, "Chips") => true
        case _ => false
      }

      //if (c.food == "Chips") true else false
    }
  }

}


