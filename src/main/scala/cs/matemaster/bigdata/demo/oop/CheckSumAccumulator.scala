package cs.matemaster.bigdata.demo.oop

/**
 * @author matemaster
 */
class CheckSumAccumulator {
    private var sum = 0

    def add(number: Int): Unit = sum += number

    def getSum(): Int = sum

}

object CheckSumAccumulator {

    private val cache = Map[String, Int]()

    def calculate(s: String): Int =
        if (cache.contains(s))
            cache(s)
        else {
            val acc = new CheckSumAccumulator
            for (c <- s)
                acc.add(c.toInt)
            val cs = acc.getSum()
            cs
        }
}
