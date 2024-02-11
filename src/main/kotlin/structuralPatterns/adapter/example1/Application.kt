package structuralPatterns.adapter.example1

open class Application { // adaptee
    protected fun saveObject() {
        println("Saving kotlin object...")
    }

    protected fun updateObject() {
        println("Updating kotlin object...")
    }

    protected fun loadObject() {
        println("Loading kotlin object...")
    }

    protected fun deleteObject() {
        println("Deleting kotlin object...")
    }
}