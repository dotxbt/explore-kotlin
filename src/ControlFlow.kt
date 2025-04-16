class ControlFlow(private val score: Int) {
    private fun ifElse() {
        if (score >= 80) {
            println("Good!")
        } else {
            println("Try again.")
        }
    }

    private fun ifElseWhen() {
        val result = when (score) {
            in 90..100 -> "Excellent"
            in 80..89 -> "Great"
            else -> "Okay"
        }
    }

    fun example() {
        ifElse()
        ifElseWhen()
    }
}