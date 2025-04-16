class NullSafety(private val name: String? = null) {
    fun example() {
        println(name?.length ?: 0)
    }
}