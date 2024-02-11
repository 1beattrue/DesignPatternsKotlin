package structuralPatterns.adapter.example1

class ApplicationToDatabaseAdapter : Application(), Database { // adapter
    override fun insert() {
        saveObject()
    }

    override fun update() {
        updateObject()
    }

    override fun select() {
        loadObject()
    }

    override fun remove() {
        deleteObject()
    }
}