class Functions(private val name: String, private val value: Int) {
    private fun voidFunction() {
        print("Hello World")
    }

    private fun returnFunction(): String {
        return "Hello, $name"
    }

    private fun String.extensionFunction() = "Hello, $this"

    private fun singleExpressionFunction() = value * value

    fun example() {
        voidFunction()
        val greet = returnFunction()
        greet.extensionFunction()
        singleExpressionFunction()
    }
}