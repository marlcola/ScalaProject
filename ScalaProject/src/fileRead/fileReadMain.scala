package fileRead

import scala.io.Source

object fileReadMain {
  def widthOfLength(s: String) = s.length.toString.length
  
  def main (args: Array[String]) {

    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines().toList
      val longestLine = lines.reduceRight(
          (a, b) => if (a.length > b.length) a else b)
      val maxLength = widthOfLength(longestLine)
      
      for (line <- lines) {
        val numSpaces = maxLength - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length + " | " + line)
//        print(widthOfLength(line) + "|")
//        println(line.length + " " + line)
      }
    }
    else {
      Console.err.println("Please enter filename")
    }
  }

  
}