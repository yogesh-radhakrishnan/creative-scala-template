import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DCanvas._
import doodle.backend.StandardInterpreter._

// To use this example, open the SBT console and type:
//
// Example.image.draw
object Example {
  val image = circle(10) on circle(20) on circle(30)
}

object Excercise {

  def filledRectangle(wid:Int, bre:Int,fColor:Color,lineW:Int,lColor:Color):Image = {
     rectangle(wid,bre) fillColor fColor lineWidth lineW lineColor lColor
  }

  def filledCircle(r:Int,fColor:Color,lineW:Int,lColor:Color):Image = {
     circle(r) fillColor fColor lineWidth lineW lineColor lColor
  }

  def main(args:Array[String])= {
    val factor = 5

    val greenRec = filledRectangle(factor * 50, factor * 20, Color.green, factor * 1, Color.green)
    val brownRec = filledRectangle(factor * 20, factor * 5, Color.brown, factor * 1, Color.black)
    val blackRec = filledRectangle(factor * 5, factor * 20, Color.white, factor * 4, Color.black)

    val smallRedCir = filledCircle(factor * 5, Color.red, factor * 2, Color.black)
    val whiteCir = filledCircle(factor * 10, Color.white, factor * 2, Color.black)
    val bigRedCir = filledCircle(factor * 15, Color.red, factor * 2, Color.black)

    val image = smallRedCir on whiteCir on bigRedCir above
      blackRec above
      brownRec above
      greenRec
    image.draw
  }
}
