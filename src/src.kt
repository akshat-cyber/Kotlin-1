class findViewById<T>(getter:Int =10) {

    var value:T? = null
    fun caller() : T? {
        return value
    }
}

fun main() {
    print(findViewById<Int>(20).caller())

}
