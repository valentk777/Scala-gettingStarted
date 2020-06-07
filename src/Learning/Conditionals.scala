package Learning

object Conditionals {
  def main(args: Array[String]) {
    val arguments: Array[String] = Array("Monday")
    // Return if 'if' is true not needed. This 'if' returns value without return
    val day: String = if (!arguments.isEmpty) arguments(0) else "Sunday"
    println(day)

    var number: Int = 0
    if (!arguments.isEmpty) {
      number = 5
    }
    else {
      number = 10
    }
    println(number)
  }
}