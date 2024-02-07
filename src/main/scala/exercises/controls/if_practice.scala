package exercises.controls

object if_practice {
  def main(arg: Array[String]): Unit = {
      // statement
      print("Input a number: ")
      val x : Int = scala.io.StdIn.readInt // for string change to readLine
      var res: String = ""
      if (x > 20) {
        println("x>20")
      } else if (x < 20) {
        println("x<20")
      } else {
        println("x==20")
      }
      // expression
      val res2 = if (x > 20) "larger than 20" else "smaller or equal to 20";
      println(s"Expression for res2: $res2")
  }

}
