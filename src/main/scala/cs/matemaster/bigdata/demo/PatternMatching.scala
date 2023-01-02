package cs.matemaster.bigdata.demo

/**
 * @author matemaster
 */
object PatternMatching {

    def main(args: Array[String]): Unit = {
        var number = 10
        number match {
            case 1 => println("1")
            case 10 => println("10")
            case _ => println("nothing")
        }
    }

}
