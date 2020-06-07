package Learning

object Loops {
  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn
    val n = stdin.readInt()
    for (i <- 1 to 10) {
      println(s"$n x $i = ${i * n}")
    }

    val letters: List[String] = List("a", "b", "c", "d")
    for (letter <- letters) {
      println(letter)
    }
  }
}
