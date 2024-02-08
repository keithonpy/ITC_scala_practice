package exercises.functions

object HigherOrderFunc {

  def math(x: Double, y: Double, f: (Double, Double)=> Double):Double = f(x,y);

  def math2(x: Double, y: Double, z: Double, f: (Double, Double)=> Double):Double = f(f(x,y), z);

  def main(args: Array[String]): Unit = {
    val result = math(50, 20, (x, y)=>x*y)
    println(result);
    val result2 = math(50, 20, (x, y)=> x max y)
    println(result2);
    // wildcard in function
    val result3 = math(50, 20, _ + _)
    println(result3)
    //much higher order function
    val result4 = math2(50, 20, 10, (x, y)=>x + y)
    println(result4)
  }

}
