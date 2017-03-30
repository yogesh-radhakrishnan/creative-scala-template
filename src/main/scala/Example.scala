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

object Excercise{
  def filledRectangle(wid:Int, bre:Int,fColor:Color,lineW:Int,lColor:Color):Image = {
     rectangle(wid,bre) fillColor fColor lineWidth lineW lineColor lColor
  }
  def filledCircle(r:Int,fColor:Color,lineW:Int,lColor:Color):Image = {
     circle(r) fillColor fColor lineWidth lineW lineColor lColor
  }

val greenRec= filledRectangle(40,25,Color.green,1,Color.green)
val brownRec = filledRectangle(20,5,Color.brown,1,Color.black)
val blackRec = filledRectangle(5,20,Color.white,4,Color.black)

val smallRedCir = filledCircle(5,Color.red,2,Color.black)
val whiteCir = filledCircle(10,Color.white,2,Color.black)
val bigRedCir = filledCircle(15,Color.red,2,Color.black)

val image = (smallRedCir on whiteCir on bigRedCir) above
blackRec above
brownRec above
greenRec
}
