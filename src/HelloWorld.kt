class HelloWorld(private val name: String) {
    private fun hello() {
        print("Hello World")
    }

    private fun sayHello() {
        print("Hello $name")
    }

    fun example() {
        hello()
        sayHello()
    }
}