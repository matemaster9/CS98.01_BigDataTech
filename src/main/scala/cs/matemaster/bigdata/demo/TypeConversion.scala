package cs.matemaster.bigdata.demo

/**
 * @author matemaster
 */
object TypeConversion {

    def main(args: Array[String]): Unit = {
        val number = 3.0.toInt
        println("number: " + number)

        val str = "100";
        println("byte: " + str.toByte)
        println("boolean: " + str.toBoolean)
        println("int: " + str.toInt)
    }

}
