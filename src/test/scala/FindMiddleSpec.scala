import org.scalatest._
import flatspec._
import matchers._

class FindMiddleSpec extends AnyFlatSpec with should.Matchers {

import FindMiddle._

  "FindMiddle" should "return 2 for input List(1,2,3,4)" in {
    findMiddleElement(List(1, 2, 3, 4)) shouldBe Option(2)
  }

  it should "return middle left element of even list" in {
    findMiddleElement(List(1,1,1,5,2,1,1,1)) shouldBe Option(5)
  }

  it should "return middle element of odd list" in {
    findMiddleElement(List(1,1,1,3,1,1,1)) shouldBe Option(3)
  }
}
