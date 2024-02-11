package structuralPatterns.adapter.example2

class CamelToTransportAdapter : Camel(), Transport { // adapter
    override fun drive() {
        move()
    }
}