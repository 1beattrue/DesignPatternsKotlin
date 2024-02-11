package structuralPatterns.bridge

class BankSystem(developer: Developer) : Program(developer) {
    override fun developProgram() {
        println("Bank System development in progress...")
        developer.writeCode()
    }
}