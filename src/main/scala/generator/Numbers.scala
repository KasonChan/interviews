package generator

/**
 * Created by ka-son on 10/3/15.
 */
trait Numbers {

  def generateRandomNumbers(N: Int, max: Int): Seq[Int] = {
    val r = scala.util.Random

    for {
      i <- 1 to N
      n = r.nextInt(max)
    } yield n
  }

}
