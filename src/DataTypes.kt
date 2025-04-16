class DataTypes {
    private fun basicTypes() {
        val thisIsInteger:Int = 34
        val thisIsString:String = "This is string"
        val thisIsDouble:Double = 234242234244.2342
        val thisIsFloat:Float = 232.3f
        val thisIsBoolean:Boolean = false
        val thisIsChar:Char = 'A'
        print(
            "Integer : $thisIsInteger" +
                    "\nDouble : $thisIsDouble" +
                    "\nString : $thisIsString" +
                    "\nFloat : $thisIsFloat" +
                    "\nBoolean : $thisIsBoolean" +
                    "\nChar : $thisIsChar"
        )
    }

    private fun typeConversion() {
        print("${"2311".toInt()}") // String to Int
        print("${" 231334535.34531 ".toDouble()}") // String to Double
        print("${" 231.31f ".toFloat()}") // String to Float
        print("${" false ".toBoolean()}") // String to Boolean
        print("${354435}") // All Value to String
    }

    fun example() {
        basicTypes()
        typeConversion()
    }
}