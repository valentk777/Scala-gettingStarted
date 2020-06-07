package Learning

object WhichAreIn {

  def main(args: Array[String]): Unit = {
    var a1 = Array("live", "arp", "strong")
    var a2 = Array("lively", "alive", "harp", "sharp", "armstrong")
    inArray(a1, a2).foreach(println)
  }

  def inArray(array1: Array[String], array2: Array[String]): Array[String] = {
    var r = Set[String]()
    for (element <- array1) {
      if (array2.exists(_ contains element)) {
        r += element
      }
    }
    return r.toArray.sorted
  }
}