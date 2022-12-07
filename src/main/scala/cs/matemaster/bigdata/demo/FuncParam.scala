package cs.matemaster.bigdata.demo

/**
 * @author matemaster
 */
object FuncParam {
    def main(args: Array[String]): Unit = {
        variableParam("m1")
        variableParam("m1", "m2", "m3")

        variableParamLast("I'm", " matemaster", "!")

        defaultValue()
        defaultValue("matemaster")

        funcWithParamName(username = "matemaster", password = "#2741y89")
    }

    def variableParam(message: String*): Unit = {
        println("message: " + message)
    }

    def variableParamLast(firstParam: String, message: String*): Unit = {
        println("defaultValue: " + firstParam)
        println("message: " + message)
    }

    def defaultValue(defaultValue: String = "default"): Unit = {
        println("message: " + defaultValue)
    }

    def funcWithParamName(username: String, password: String): Unit = {
        println(s"用户名: ${username}, 密码: ${password}")
    }
}
