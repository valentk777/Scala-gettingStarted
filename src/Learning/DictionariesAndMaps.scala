// https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem?h_r=next-challenge&h_v=zen
package Learning

object DictionariesAndMaps {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    var phoneBook: Map[String, Int] = Map();
    val n = stdin.readLine().toInt
    for (i <- 1 to n) {
      val values: Array[String] = stdin.readLine().split(" ")
      phoneBook += (values(0) -> values(1).toInt)
    }

    val in = Iterator.continually(stdin.readLine).takeWhile(s => s != null && s.nonEmpty).toList
    for (element <- in) {
      if (phoneBook.contains(element)) {
        println(s"$element ${phoneBook(element)}")
      } else {
        println("Not found")
      }
    }
  }
}
