package cs.matemaster.bigdata.demo

import scala.collection.immutable.HashSet

/**
 * @author matemaster
 */
object ScalaSet {

    def main(args: Array[String]): Unit = {
        var movieSet = Set("Hitch", "Poltergeist")
        movieSet += "Shrek"
        println(movieSet)

        val hashSet = HashSet("Tomatoes", "Chilies")
        println(hashSet + "Coriander")

        var treasureMap = Map[Int, String]()
        treasureMap += (1 -> "Go to island.")
        treasureMap += (2 -> "Find big X on ground.")
        treasureMap += (3 -> "Dig.")
        println(treasureMap(2))
        println(treasureMap)

        val romanNumeral = Map(
            1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
        )
        println(romanNumeral(4))
    }
}
