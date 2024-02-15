package exercises.collections

object Sets {
  val mySet: Set[Int] = Set(1, 1, 2, 2, 3, 3)
  // to make set mutable
  var mutMySet = scala.collection.mutable.Set(1, 1, 2, 2, 3, 3, 4);

  def main(args: Array[String]): Unit = {
    println("Add 10 to mySet: "+(mySet+10))
    println("No change for mySet: "+mySet)

    println("Check 8 in mySet or not? "+ mySet(8))

    // concat two sets
    println("Concatenation of two sets: "+(mySet ++ mutMySet))
    println("Concatenation of two sets: "+(mySet.++(mutMySet)))

    // intersection of two sets
    println("Intersection of two Sets: "+mySet.&(mutMySet))
    println("Intersection of two Sets: "+mySet.intersect(mutMySet))


    // set operation
    println("Maximum of the set: " +mySet.max)
    println("Maximum of the set: " +mySet.min)

    mySet.foreach(println)

    for (i<-mySet) println(i)
  }
}
