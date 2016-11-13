package functionalObject

object Main extends App {
//  val rat = new Rational(1, 2)
//  val illegalRat = new Rational(1, 0)
  val oneHalf = new Rational(1, 2)
  val twoThirds = new Rational(2, 3)
  val twelveThirds = new Rational(12, 3)
  val normalizedRat = new Rational(66, 42)

  val addRat = oneHalf + twoThirds
  val munRat = oneHalf * twoThirds * twelveThirds
  val maxRat = oneHalf max twoThirds
  val resultRat = oneHalf + twoThirds + 2 + 3 * 2 / 12 * 33
  
//  println(addRat.toString)
//  println(munRat.toString)
//  println(maxRat.toString)
//  println(twelveThirds.toString)
//  println(normalizedRat.toString)
  println(resultRat.toString())
      
}