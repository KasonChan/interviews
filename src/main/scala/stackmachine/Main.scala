package stackmachine

import scala.collection.mutable

/**
 * Created by kasonchan on 10/8/15.
 *
 * Given a string S consistng of N characters containing input for the stack
 * machine, returns the result the machine would return if given this string.
 * The function should return -1 if the machine would report an error when
 * processing the string. Assume that the length of S is within the range
 * [0..200,000]; string S consists only of the following characters: "0..9", "+"
 * and/or "*".
 */
object Main extends App {

  val s = new mutable.Stack[Int]

  def solution(S: String): Int = {
    // write your code in Scala 2.10

    val r = for (i <- 0 to S.length - 1) {
      if (!helper(S(i)))
        return -1
    }

    if (s.nonEmpty)
      s.pop()
    else
      -1
  }

  def helper(c: Char): Boolean = {
    c.isDigit match {
      case true => {
        s.push(c.asDigit)
        true
      }
      case false => {
        c match {
          case '+' => {
            val o1 = if (s.nonEmpty) Some(s.pop) else None
            val o2 = if (s.nonEmpty) Some(s.pop) else None

            (o1, o2) match {
              case (Some(x), Some(y)) =>
                s.push(x + y)
                true
              case _ => false
            }
          }
          case '*' => {
            val o1 = if (s.nonEmpty) Some(s.pop) else None
            val o2 = if (s.nonEmpty) Some(s.pop) else None

            (o1, o2) match {
              case (Some(x), Some(y)) =>
                s.push(x * y)
                true
              case _ => false
            }
          }
          case _ => false
        }
      }
    }
  }

  println(solution("13+62*7+*"))
  println(solution("11++"))

}
