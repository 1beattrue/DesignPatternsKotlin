package structuralPatterns.adapter.example1

interface Database { // target
    fun insert()

    fun update()

    fun select()

    fun remove()
}