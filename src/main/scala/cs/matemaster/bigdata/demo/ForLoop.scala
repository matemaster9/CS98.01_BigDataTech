package cs.matemaster.bigdata.demo

import scala.util.control.Breaks

/**
 * @author matemaster
 */
object ForLoop {

    def main(args: Array[String]): Unit = {
        for (i <- 1 to 10) {

        }

        for (i <- 1 until 10) {

        }

        Breaks.breakable(for (elem <- 1 to 10) {
            if (elem % 2 == 0) {
                Breaks.break()
            }
            println("element: " + elem)
        })
    }
}
