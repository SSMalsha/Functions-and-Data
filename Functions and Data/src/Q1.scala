object Q1 extends App{

  class Rational(x: Int, y: Int){

    private def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)
    private val g = gcd(Math.abs(x), Math.abs(y))
    val numer = x / g
    val denom = y / g

    def neg = new Rational(- this.numer, this.denom)

    override def toString = this.numer.toString + " / " + this.denom.toString
  }
  val number = new Rational(4, 7)

  println(number)
  println(number.neg)
}

