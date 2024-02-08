package exercises.controls

object While_Practice{
  def main (args: Array[String]): Unit = {
      var x = 0;
      // while loop
      while (x < 10) {
        println(s"x = $x")
        x += 1;
      }

      // do while loop
      var y = 9;
      do {
        println(s"y = $y")
        y -= 1;
      } while (y >= 0)

  }

}
