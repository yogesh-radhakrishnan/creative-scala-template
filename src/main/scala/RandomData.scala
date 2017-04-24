
object RandomData {

  def main(args: Array[ String ]): Unit = {

    sealed trait Noun
    case object Noel extends Noun
    case object `The Cat` extends Noun
    case object `The Dog` extends Noun

    sealed trait verb
    case object `wrote` extends verb
    case object `chased` extends verb
    case object `slept on` extends verb

    sealed trait objs
    case object `the book` extends objs
    case object `the ball` extends objs
    case object `the bed` extends objs

    for {
      sub <- List(Noel, `The Cat`, `The Dog`)
      verb <- associatedVerb(sub)
      obj <- associatedObj(verb)
    } println(s"$sub $verb $obj")


    def associatedVerb(sub: Noun): List[ verb ] = {
      sub match {
        case Noel => List(`wrote`, `chased`, `slept on`)
        case `The Cat` => List(`chased`, `slept on`)
        case `The Dog` => List(`chased`, `slept on`)
      }
    }

    def associatedObj(verb: verb): List[ objs ] = {
      verb match {
        case `wrote` => List(`the book`)
        case `chased` => List(`the ball`)
        case `slept on` => List(`the bed`)
      }
    }
  }
}

