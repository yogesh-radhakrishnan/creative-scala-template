
case class Cat(color: String, food: String)

object TestCat {

  def main(args: Array[ String ]) = {
    val Henderson = Cat("Ginger", "Chips")
    val Oswald = Cat("Black", "Milk")
    val Quentin = Cat("Tabby and white", "Curry")
  }

  object ChipShop {

    def WillServer(c: Cat): Boolean = {
      if (c.food == "Chips") true else false
    }
  }

}


