package interestingpoint

/**
 * Created by kasonchan on 10/7/15.
 *
 * A digital clock represents a point in time using the format "HH:MM:SS" where
 * "HH" is a two-digit number between 0 and 23, which stands for hours, whereas
 * "MM" and "ss" are two-digit numbers between 0 and 59 which stand for minutes
 * and seconds. Interesting if it use at most two different digits to print.
 * The goal is to cound the number of interesting points that can be observed
 * on the clock in a given period of time. Assume string S and T follow the
 * format "HH:MM:SS" strictly; string S describes a point in time before T on
 * the same day.
 */
object Main extends App {

  def solution(S: String, T: String): Int = {
    // write your code in Scala 2.10
    val s = S.split(":")
    val t = T.split(":")

    val ss = s.mkString("").toInt
    val st = t.mkString("").toInt

    val pr = ss to st

    val r = pr.filter(x => helper(x))

    r.length
  }

  def helper(x: Int): Boolean = {
    x.toString.distinct.length <= 2
  }

  println(solution("15:15:00", "15:15:12"))
  println(solution("22:22:21", "22:22:23"))
  println(solution("11:11:00", "11:11:24"))

}