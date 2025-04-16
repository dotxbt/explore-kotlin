class Variables(private val num: Int) {
    fun example() {
        // val = read-only or immutable, var = mutable
        var age = 25 // can be reassigned
        val name = "Alex" // can't be reassigned
        age = num
        print("My name is $name, I'm $age years old.")
    }
}