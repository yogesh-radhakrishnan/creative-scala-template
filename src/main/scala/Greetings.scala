

object Person {
  def apply(name: String) = {
    val parts = name.split(" ")
    val firstName = parts(0)
    val lastName = parts(1)
    new Person(firstName, lastName)
  }
  val firstName = "yogesh"
  val lastName = "Radhakrishnan"

}


object Alien {
  def greet(p: Person.type): String = {
    "Hello " + p.firstName
  }
}

class Person(first: String, last: String) {

}