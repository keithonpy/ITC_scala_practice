package exercises.controls

object For_Practice{
  def main(args: Array[String]){
    // 1 to 5
    for (i <-  1 to 5){
      println("i using to "+ i);
    }


    // 1 until 5
    for (i <- 1 until 6){
      println("i using until "+ i)
    }


    // nested for loop
    for (i <- 1 to 9;  j<- 1 to 3){
      println(s"i using to $i and j using to $j")
    }

    // outer loop
    for (i <- 1 to 3) {
      // inner loop
      for (j<- 1 to 3){
        println(s"i is $i, j is $j");
      }
    }


    // for loop with list with condition

    val lst = List(1, 2, 3, 4, 99, 100)

    for (i <- lst; if i < 5){
      println(s"i is smaller than 5 : $i")
    }
    // expression for for loop, use curly bracket instead
    val res = for {i<-lst; if i < 5} yield {
      i * i
    }

    println(s"Variables defined in for loop: $res")

}

}
