case class TimeStamp(seconds: Long) {
  def addSeconds(a: TimeStamp): TimeStamp = {
    this.copy(this.seconds + a.seconds)
  }

}


object TimeStamp {
  def apply(hours: Int, minutes: Int, seconds: Int): TimeStamp = {
    new TimeStamp(hours * 60 * 60 + minutes * 60 + seconds)
  }

  def apply(hours: Int, minutes: Int): TimeStamp = {
    new TimeStamp(hours * 60 * 60 + minutes * 60)
  }

  def beginningOfTheDay: TimeStamp = {
    new TimeStamp(0)
  }


}

object testTimeStamp {
  def main(args: Array[ String ]): Unit = {
    val x = TimeStamp(1, 1, 1)
    val y = TimeStamp(1, 1)
    val z = TimeStamp(1)

    println(x.addSeconds(y).addSeconds(z))
    TimeStamp.beginningOfTheDay


  }
}
