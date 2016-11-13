package ChecksumAccumulator
import ChecksumAccumulator.calculate

object ChecksumOfSeasons extends App {
  val seasons = List("Spring", "Summer", "Fall", "Winter")
  val labelMaxLength = LabelAlignment.getLongestLength(seasons)
  for (season <- seasons) {
    println(LabelAlignment.paddingLabel(season, labelMaxLength) + ": " + calculate(season))
  }
}