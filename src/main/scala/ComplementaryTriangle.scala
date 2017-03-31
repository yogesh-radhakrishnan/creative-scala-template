import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DCanvas._
import doodle.backend.StandardInterpreter._

/**
  * Created by yogeshradhakrishnan on 3/31/17.
  */
object ComplementaryTriangle {


  def main(args:Array[String]):Unit ={

    val factor = 5

    def filledTriangle(w:Int,h:Int,fColor:Color,lineW:Int,lColor:Color):Image = {
      triangle(factor*w,factor*h) fillColor fColor lineWidth factor*lineW lineColor lColor
    }

    val blue = Color.darkSlateBlue spin (45.degrees)
    val pink = Color.darkSlateBlue spin (20.degrees)
    val violet = Color.darkSlateBlue spin (10.degrees)

    val image = filledTriangle(30,30,blue,3,blue darken(.2 normalized)) above
      (filledTriangle(30,30,pink,3,pink darken(.2 normalized)) beside
    filledTriangle(30,30,violet,3,violet darken(.2 normalized)))

    image.draw

  }

}
