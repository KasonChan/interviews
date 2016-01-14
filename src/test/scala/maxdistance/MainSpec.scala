package maxdistance

import org.scalatest.{FlatSpec, Matchers}
import maxdistance.Main.solution

/**
  * Created by kasonchan on 1/14/16.
  */
class MainSpec extends FlatSpec with Matchers {

  "Main" should "pass" in {
    solution(Array(1, 3, -3)) shouldBe 6
    solution(Array(-8, 4, 0, 5, -3, 6)) shouldBe 14
  }

}
