package exercises.controls

import scala.io.StdIn.readInt

object Match_Practice {
  def main(args: Array[String]): Unit = {
    // statement
    print("Input a number: ")
    val age = readInt

    age match {
      case 10 | 20 => println("Your age is either 10 or 20");
      case 30 => println("Your age is 30");
      case 40 => println("Your age is 40");
      case 50 => println("Your age is 50");
      case _ => println("Your age is either larger than 50 or not divided by 10")
    }

    val result = age match {
      case 10 | 20 => "Your age is either 10 or 20";
      case 30 =>"Your age is 30";
      case 40 =>"Your age is 40";
      case 50 =>"Your age is 50";
      case _ => "Your age is either larger than 50 or not divided by 10";
    }

    println(s"The result is that $result")
  }

}
