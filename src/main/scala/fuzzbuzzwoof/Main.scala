package fuzzbuzzwoof

/**
 * Created by kasonchan on 10/5/15.
 *
 * Given a positive integer N, prints the consecutive numbers from 1 to N, each
 * on a separate line. Any number divisible by 3, 5 or 7 should be replaced by
 * the word Fuzz, Buzz and Woof respectively.
 */
object Main {

  def main(args: Array[String]) {
    solution(105)
  }

  def solution(N: Int) = {
    1 to N foreach { i =>
      println((i % 3, i % 5, i % 7) match {
        case (0, 0, 0) => "FuzzBuzzWoof"
        case (0, 0, _) => "FuzzBuzz"
        case (0, _, 0) => "FuzzWoof"
        case (_, 0, 0) => "BuzzWoof"
        case (0, _, _) => "Fuzz"
        case (_, 0, _) => "Buzz"
        case (_, _, 0) => "Woof"
        case _ => i
      })
    }
  }

}
