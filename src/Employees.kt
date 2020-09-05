fun main(){
    val webDev = webDeveloper()



    webDev.name()
    webDev.age()
    webDev.salary()

    val andDev = androidDeveloper()
    andDev.name()
    andDev.age()
    andDev.salary()

    val iosDev = iosDeveloper()
    iosDev.name()
    iosDev.age()
    iosDev.salary()
}


abstract class Employee{
    abstract var  name:String
    abstract var  age:Int

    abstract fun name()
    abstract fun age()
    abstract fun salary()

}

class webDeveloper:Employee(){
    override var name: String="Fatma Ghalib"
    override var age: Int=25
    var salsry:Double=100.0

    init {
        println("------------------------------------")
        println("Web Developer information:")
    }

    override fun name() {
        println("Name: $name")
    }

    override fun age() {
        println("Age: $age")
    }

    override fun salary() {
        println("Salary: $salsry")
    }


}

class androidDeveloper:Employee(){
    override var name: String="Maimonah Muharram"
    override var age: Int=25
    var salsry:Double=200.0

    init {
        println("------------------------------------")
        println("Android Developer information:")
    }

    override fun name() {
        println("Name: $name")
    }

    override fun age() {
        println("Age: $age")
    }

    override fun salary() {
        println("Salary: $salsry")
    }
}

class iosDeveloper:Employee(){
    override var name: String="Fatma Al-Awami"
    override var age: Int=25
    var salsry:Double=150.0

    init {
        println("------------------------------------")
        println("IOS Developer information:")
    }

    override fun name() {
        println("Name: $name")
    }

    override fun age() {
        println("Age: $age")
    }

    override fun salary() {
        println("Salary: $salsry")
    }
}