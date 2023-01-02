package cs.matemaster.bigdata.demo

/**
 * @author matemaster
 */
object BaseScalaLang {

    def main(args: Array[String]): Unit = {

    }

    def parameterizeArray(): Unit = {
        val names = new Array[String](3)
        names(0) = "mate"
        names(1) = "master"
        names(2) = "matemaster"
        for (elem <- names) {
            println(elem)
        }

        names.foreach(item => println(item))
    }

    def arrayUpdate(): Unit = {
        val names = new Array[String](3)
        names.update(0, "mate")
        names.update(1, "master")
        names.update(2, "matemaster")
        names.foreach(item => println(item))
    }

    def initArray(): Unit = {
        val names = Array("mate", "master", "matemaster")
        val companion = Array.apply("mate", "master", "matemaster")
        names.foreach(item => println(item))
        companion.foreach(item => println(item))
    }

    def immutableLists(): Unit = {
        val names = List("mate", "master", "matemaster")
        val namesAdd = "I'm" :: names
        names.foreach(item => println(item))

        // List("mate", "master", "matemaster")
        println(namesAdd)
    }

    def emptyList(): Unit = {
        val emptyColl1 = List()
        val emptyColl2 = Nil

        // 执行结果：List()
        println(emptyColl1)
        println(emptyColl2)
    }
}
