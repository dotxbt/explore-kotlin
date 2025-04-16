class CollectionTypes {
    private fun listExample() {
        val list = listOf(1, 2, 3, 4, 5)
        list.forEach { item ->
            print(item)
        }

        val mutableList = mutableListOf("a", "b")
        mutableList.forEachIndexed { index, item ->
            print("$index : $item")
        }
    }

    private fun setExample() {
        val sets = setOf(1, 2, 3)
        sets.forEach {
            print(it)
        }

    }

    private fun mapExample() {
        val map = mapOf("name" to "Alex", "address" to "Jl. Free Style 45")
        map.forEach { item ->
            print(item)
        }
    }

    fun example() {
        listExample()
        setExample()
        mapExample()
    }
}