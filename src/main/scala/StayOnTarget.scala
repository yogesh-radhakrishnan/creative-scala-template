//import doodle.core._
//import doodle.core.Image._
//import doodle.syntax._
//import doodle.jvm.Java2DCanvas._
//import doodle.backend.StandardInterpreter._
//
///**
//  * Created by yogeshradhakrishnan on 3/31/17.
//  */
//object StayOnTarget {
//
//  val factor = 5
//
//  def filledRectangle(wid:Int, bre:Int,fColor:Color,lineW:Int,lColor:Color):Image = {
//    rectangle(factor* wid,factor * bre) fillColor fColor lineWidth (factor*lineW) lineColor lColor
//  }
//
//  def filledCircle(r:Int,fColor:Color,lineW:Int,lColor:Color):Image = {
//    circle(factor*r) fillColor fColor lineWidth (factor*lineW) lineColor lColor
//  }
//
//  def main(args:Array[String]):Unit= {
//
//
//    val greenRec = filledRectangle(50, 20, Color.green, 1, Color.green)
//    val brownRec = filledRectangle(20, 5, Color.brown, 1, Color.black)
//    val blackRec = filledRectangle(5, 20, Color.white, 4, Color.black)
//
//    val smallRedCir = filledCircle(5, Color.red, 2, Color.black)
//    val whiteCir = filledCircle(10, Color.white, 2, Color.black)
//    val bigRedCir = filledCircle(15, Color.red, 2, Color.black)
//
//    val image = smallRedCir on whiteCir on bigRedCir above
//      blackRec above
//      brownRec above
//      greenRec
//    image.draw
//  }
//}


//Associative
//Commutative
//identity
