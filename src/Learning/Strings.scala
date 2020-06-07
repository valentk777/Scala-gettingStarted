package Learning

object Strings {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val t = stdin.readInt()
    for (_ <- 1 to t) {
      val s = stdin.readLine()
      var s0 = ""
      var s1 = ""
      for (i: Int <- 0 until s.length) {
        if (i % 2 == 0) {
          s0 += s.charAt(i)
        } else {
          s1 += s.charAt(i)
        }
      }
      println(s"$s0 $s1")
    }
  }
}
