package structuralPatterns.bridge

class StockExchange(developer: Developer) : Program(developer) {
    override fun developProgram() {
        println("Stock Exchange development in progress...")
        developer.writeCode()
    }
}