package cs.matemaster.bigdata.demo

/**
 * @author matemaster
 */
object ScalaTuple {

    def main(args: Array[String]): Unit = {
        tuple1()
    }

    def tuple1(): Unit = {
        val pair = (100, "100")
        println(pair._1)
        println(pair._2)
    }
}
