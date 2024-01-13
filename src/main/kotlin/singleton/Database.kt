package singleton

class Database private constructor() { // singleton
    private val _items = mutableListOf<Int>()
    val items: List<Int>
        get() = _items

    fun addItem(item: Int) {
        _items.add(item)
    }

    companion object {
        private var INSTANCE: Database? = null

        fun getInstance(): Database {
            INSTANCE?.let {
                return it
            }

            val database = Database()
            INSTANCE = database

            return database
        }
    }
}