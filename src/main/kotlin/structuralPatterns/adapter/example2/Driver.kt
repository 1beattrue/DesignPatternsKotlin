package structuralPatterns.adapter.example2

class Driver {
    fun travel(transport: Transport) {
        transport.drive()
    }
}