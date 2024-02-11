package structuralPatterns.adapter.example2

open class Camel : Animal { // adaptee
    override fun move() {
        println("Верблюд идет по пескам пустыни...")
    }
}