package cs.matemaster.bigdata.demo.functional_object

/**
 * @author matemaster
 */
class Rational(n: Int, d: Int) {

    val number: Int = n
    val denominator: Int = d

    require(d != 0)

    override def toString: String = ("Rational: " + n + "/" + d)

    def add(rational: Rational): Rational = {
        new Rational(
            number * rational.denominator + rational.number * denominator,
            denominator * rational.denominator
        )
    }

    def lessThan(rational: Rational): Boolean = number * rational.denominator < rational.number * denominator

    def max(rational: Rational): Rational = {
        if (this lessThan rational) {
            rational
        } else {
            this
        }
    }

    def this(n: Int) = this(n, 1)
}
