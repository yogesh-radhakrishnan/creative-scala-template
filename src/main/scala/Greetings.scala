

object Person {

  val firstName = "yogesh"
  val lastName = "Radhakrishnan"

}


object Alien {
  def greet(p: Person.type): String = {
    "Hello " + p.firstName
  }
}