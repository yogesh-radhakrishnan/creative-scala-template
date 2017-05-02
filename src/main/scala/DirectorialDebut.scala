
case class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name = s"$firstName $lastName"
}

object Director {
  //  def apply(firstName: String, lastName: String, yearOfBirth: Int) = {
  //    new Director(firstName, lastName, yearOfBirth)
  //  }

  def older(dir1: Director, dir2: Director): Director = {
    if (dir1.yearOfBirth >= dir2.yearOfBirth) dir1 else dir2
  }
}


case class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {

  def directorAge = yearOfRelease - director.yearOfBirth

  def isDirectedBy(dir: Director): Boolean = if (dir.name == director.name) true else false

  //  def copy(name: String = this.name, yearOfRelease: Int = this.yearOfRelease, imdbRating: Double = this.imdbRating, director: Director = this.director): Film = {
  //    new Film(name, yearOfRelease, imdbRating, director)
  //  }
}

object Film {
  //  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) = {
  //    new Film(name, yearOfRelease, imdbRating, director)
  //  }

  def highestRating(film1: Film, film2: Film): Film = {
    if (film1.imdbRating >= film2.imdbRating) film1 else film2
  }

  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director = {
    if (film1.directorAge >= film2.directorAge) film1.director else film2.director
  }
}


object testFilm {
  def main(args: Array[ String ]): Unit = {
    val eastwood = new Director("Clint", "Eastwood", 1930)
    val mcTiernan = new Director("John", "McTiernan", 1951)
    val nolan = new Director("Christopher", "Nolan", 1970)
    val someBody = new Director("Just", "Some Body", 1990)
    val memento = new Film("Memento", 2000, 8.5, nolan)
    val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
    val inception = new Film("Inception", 2010, 8.8, nolan)
    val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
    val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
    val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
    val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
    val invictus = new Film("Invictus", 2009, 7.4, eastwood)
    val predator = new Film("Predator", 1987, 7.9, mcTiernan)

    val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
    val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
    val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)
//    assert(eastwood.yearOfBirth == 1930) // should be 1930
//    assert(dieHard.director.name == "John McTiernan")
//    assert(invictus.isDirectedBy(nolan) == false)
//    assert(inception.copy().copy().copy() == inception)
//
    println(Dad.rate(unforgiven))
  }
}


object Dad {
  def rate(film: Film): Double = {
    film match {
      case Film(_, _, _, Director("Clint", "Eastwood", _)) => 10.0
      case Film(_, _, _, Director("John", "McTiernan", _)) => 7.0
      case _ => 3.0
    }
  }

}