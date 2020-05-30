object operators {
  def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {
    val tip = meal_cost * tip_percent / 100
    val tax = meal_cost * tax_percent / 100
    val total = meal_cost + tip + tax
    println(total.round)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val meal_cost = stdin.readLine.trim.toDouble
    val tip_percent = stdin.readLine.trim.toInt
    val tax_percent = stdin.readLine.trim.toInt

    solve(meal_cost, tip_percent, tax_percent)
  }
}
