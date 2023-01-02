package cs.matemaster.bigdata.demo

import scala.io.StdIn

/**
 * @author matemaster
 */
object StandardInput {

    def main(args: Array[String]): Unit = {
        val name = StdIn.readLine()
        println("name: " + name)
    }
}
