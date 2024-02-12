package structuralPatterns.flyweight

class KotlinDeveloper : Developer { // concrete flyweight
    override fun writeCode() {
        println("Kotlin developer writes Kotlin code...")
    }
}