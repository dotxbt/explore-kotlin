class Person(val name: String, var age: Int)

class PersonWithMethod(private val name: String, private var age: Int) {
    fun print() {
        print("Name : $name, age : $age")
    }
}

// INHERITANCE
open class Parent {
    open fun speak() = "I'm parent"
}

class ChildOne: Parent()

class ChildTwo: Parent() {
    override fun speak() = "I'm child two"
}

// DATA CLASS
data class User(val name: String, val age: Int)


// SEALED CLASS
sealed class Result
class Success(val data: String): Result()
class Error(val error: String): Result()
data object Loading : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("Data: ${result.data}")
        is Error -> println("Error: ${result.error}")
        is Loading -> println("Loading...")
    }
}

class ClassAndObject {
    fun example() {
        val p = Person("John", 30)
        println("name : ${p.name}, age : ${p.age}")

        val pwm = PersonWithMethod("John", 30)
        pwm.print()

        val c1 = ChildOne()
        c1.speak()
        val c2 = ChildTwo()
        c2.speak()

        val u1 = User("John", 69)
        val u2 = User("John", 69)
        if (u1.copy(name = "Larry") == u2 ) {
            print("YES")
        } else {
            print("NO")
        }
        handleResult(Success("OKAY"))
    }
}