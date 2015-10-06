package phonereformat

/**
 * Created by kasonchan on 10/6/15.
 *
 * Given a string S representing a phone number, which we would like to reformat.
 * String consists of N characters: digits, spaces and/or dashes. It contains at
 * least two digits. Assume that N is an integer within the range [2,100]; string
 * S consists only of digits (0-9), spaces and/or dashes (-); string S contains
 * at least two digits. We want to reformat the given phone number in such a way
 * that the digits are grouped in blocks of length three, separated by single
 * dashes. If necessary, the final block or the last two blocks can be length
 * two.
 */
object Main extends App {

  def solution(S: String): String = {
    val pattern = "( |-)".r
    val pr1 = pattern replaceAllIn(S, "")

    val grouped3: List[String] = pr1.grouped(3).toList
    val pr2 = grouped3.mkString("-")

    val i = pr2.length() - 2

    val r = if (pr2(i) == '-') {
      val r1 = new StringBuilder(pr2).deleteCharAt(i).toString
      val r2 = new StringBuilder(r1).replace(i - 1, i - 1, "-").toString()
      r2
    }
    else {
      pr2
    }

    r
  }

  val solutions = List(solution("00"),
    solution("00-44  48 5555 8361"),
    solution("0 - 22 1985--324"),
    solution("555372654"))

  solutions.foreach(println)

}
