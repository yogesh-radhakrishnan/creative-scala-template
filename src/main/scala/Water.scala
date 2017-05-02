
sealed trait Source

final case object Well extends Source
final case object Spring extends Source
final case object Tap extends Source


class Water(val size:Int, val source:Source, val carbonated:Boolean) {

}
