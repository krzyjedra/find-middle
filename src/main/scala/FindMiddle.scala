object FindMiddle extends App {

  def findMiddleElement[T](xs: List[T]): Option[T] = {
    if (xs.length % 2 == 0) {
      val a = xs.length / 2
      val b = xs.apply(a - 1)
      Option(b)
    } else {
      val a = (xs.length + 1) / 2
      val b = a - 1
      val c = xs.apply(b)
      Option(c)
    }
  }

}
