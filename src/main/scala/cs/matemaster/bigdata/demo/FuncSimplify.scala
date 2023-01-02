package cs.matemaster.bigdata.demo

/**
 * @author matemaster
 */
object FuncSimplify {

    def main(args: Array[String]): Unit = {
        println(toUpperCase("matemaster"))
        println(toUpperCaseLambda("matemaster"))
        println(toUpperCaseLambdaV2("matemaster"))
    }

    def toUpperCase(string: String): String = {
        string.toUpperCase
    }

    def toUpperCaseLambda(string: String): String = string.toUpperCase

    def toUpperCaseLambdaV2(string: String) = string.toUpperCase
}
