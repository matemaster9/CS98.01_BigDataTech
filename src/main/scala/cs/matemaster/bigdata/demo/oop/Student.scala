package cs.matemaster.bigdata.demo.oop

/**
 * @author matemaster
 */
class Student {
    var studentId: Int = 100
    var studentName: String = "matemaster"
}

object MainFunc {
    def main(args: Array[String]): Unit = {
        val student = new Student()
        println("studentId: " + student.studentId)
        println("studentName: " + student.studentName)
    }
}
