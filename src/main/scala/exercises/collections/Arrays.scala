package exercises.collections
import Array._

object Arrays {
  val myarray: Array[Int] = new Array[Int](4);
  val myarray2: Array[Int] = Array(1, 2, 3, 4, 5);

  def main(args: Array[String]): Unit = {
    myarray(0) = 10;
    myarray(1) = 20;
    // give weird output
    println(myarray);
    // use for loop to print array
    for (i <- myarray) println(i);
    myarray(2) = 30;
    myarray(3) = 40;

    // use position to print array
    for (i<-0 until myarray.length) println(myarray(i));

    //concat two array
    val res = concat(myarray, myarray2);
    println("Concatenation of two arrays")
    for (i <- res) println(i);
  }

}
