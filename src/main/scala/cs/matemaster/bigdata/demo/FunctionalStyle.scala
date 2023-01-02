package cs.matemaster.bigdata.demo

/**
 * @author matemaster
 */
object FunctionalStyle {


    def main(args: Array[String]): Unit = {
        printArgs(Array("mate", "m", "a", "t", "e"))
        printArgs2(Array("mate", "m", "a", "t", "e"))
        printArgs3(Array("mate", "m", "a", "t", "e"))
        formatArgs(Array("mate", "m", "a", "t", "e"))
    }

    def printArgs(args: Array[String]): Unit = {
        var i = 0
        while (i < args.length) {
            println(args(i))
            i += 1
        }
    }

    def printArgs2(args: Array[String]): Unit = {
        for (elem <- args) {
            println(elem)
        }
    }

    def printArgs3(args: Array[String]): Unit = {
        args.foreach(println)

    }

    def formatArgs(args: Array[String]) = {
        args.mkString("\n")
    }
}
