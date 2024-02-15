package exercises.collections

object tuples {
    val myTuple = (1, 2, "hello", true)
    // tuple declaration with Tuple need to add the element number inside
    val myTuple2 = new Tuple3(4, 5, 6)

    val myTuple3 = new Tuple3(1, "Hello", (2, 3))
    def main(args: Array[String]): Unit = {
      println(myTuple)
      println(myTuple2)
      //print all the element of the tuple
      println(myTuple._1)
      println(myTuple._2)
      println(myTuple._3)
      println(myTuple._4)

      myTuple.productIterator.foreach{
        i => println(i);
      }
      // print the tuple
      println(1->"Tom")
      // print tuple inside the tuple
      println(1->"Tom"->true)
      // print 2nd element in tuple within the tuple
      println(myTuple3._3._2)
    }
}
