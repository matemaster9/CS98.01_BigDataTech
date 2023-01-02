package cs.matemaster.bigdata.demo.oop

/**
 * @author matemaster
 */
class Computer(model: String, price: Int) {
    var producer: String = "HUAWEI"

    def this(model: String, price: Int, producer: String) {
        this(model, price)
        println("producer: " + producer)
    }
}
