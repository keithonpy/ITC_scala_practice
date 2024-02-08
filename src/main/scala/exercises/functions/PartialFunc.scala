package exercises.functions
import java.util.Date


object PartialFunc {
  def log(date: Date, message:String) = {

    println(date+" " +message)
  }
  def main(args: Array[String]): Unit = {
    // Fully applied function ;
    // eg. you have 3 arguments in the function and you declared all the arguments beforehand
    val sum = (a:Int, b:Int, c:Int) => a + b + c;
    println(sum(10, 20, 30))

    // Partial applied function
    // keep some argument as default or wildcard
    val sum2 = sum(10, 20, _:Int)
    println(sum2(30));

    // other partial applied function example
    val date = new Date();
    val newLog = log(date, _ : String);
    newLog("message 1")
    newLog("message 2")

  }

}
