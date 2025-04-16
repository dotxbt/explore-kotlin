class Loop(private val max: Int) {
    private fun forLoop() {
        for (i in 1..max) {
            println(i)
        }
    }

    private fun whileLoop() {
        var count = 0
        while (count < max) {
            println(count)
            count++
        }
    }

    fun example() {
        forLoop()
        whileLoop()
    }
}