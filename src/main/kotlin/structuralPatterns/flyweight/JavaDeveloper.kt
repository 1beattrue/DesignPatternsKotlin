package structuralPatterns.flyweight

class JavaDeveloper : Developer { // concrete flyweight
    override fun writeCode() {
        println("Java developer writes Java code...")
    }
}