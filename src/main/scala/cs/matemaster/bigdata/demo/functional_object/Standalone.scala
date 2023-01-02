package cs.matemaster.bigdata.demo.functional_object

/**
 * @author matemaster
 */
object Standalone {

    def main(args: Array[String]): Unit = {
        closureFactory()
    }

    def demo1(): Unit = {
        val oneHalf = new Rational(1, 2)
        val twoThirds = new Rational(2, 3)
        oneHalf add twoThirds
        println(oneHalf add twoThirds)
        //        oneHalf.add(twoThirds)
    }

    def closureFactory(): Unit = {
        val value = List[Int](-1, 2, 3, 4, 56, 6)
        val result = value.filter(item => item % 2 == 0)
        println(result)
    }
}
