package Learning

object Arrays {
  def main(args: Array[String]) {
    val arr = scala.io.StdIn.readLine.split(" ").map(_.trim.toInt)
    println(arr.reverse.mkString(" "))

    for(i <- 0 to 5) {
      println (arr(i)) // Selecting array elements
    }
  }
}
