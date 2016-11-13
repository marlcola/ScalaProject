package ChecksumAccumulator

object LabelAlignment {
  def getLongestLength(list: List[String]): Int = {
    val longestLine = list.reduceRight(
        (a, b) => if (a.length > b.length) a else b
    )
    longestLine.length
  }

  def paddingLabel(label: String, maxLength: Int): String =
    " " * (maxLength - label.length) + label
}