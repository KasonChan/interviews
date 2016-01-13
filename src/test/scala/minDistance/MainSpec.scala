package minDistance

import org.scalatest.{FlatSpec, Matchers}
import minDistance.Main.solution

/**
  * Created by kasonchan on 1/13/16.
  */
class MainSpec extends FlatSpec with Matchers {

  val worstCase = (for {
    i <- 100000 to 0 by -1
  } yield i).toArray

  "Main" should "pass" in {
    solution(Array(8, 24, 3, 20, 1, 17)) shouldBe 2
    solution(Array(7, 21, 3, 42, 3, 7)) shouldBe 0
    solution(Array(100000, 99999)) shouldBe 1
    solution(worstCase) shouldBe 1
  }

}
