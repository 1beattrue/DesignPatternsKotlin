package structuralPatterns.bridge

abstract class Program protected constructor( // bridge
    protected val developer: Developer
) {
    abstract fun developProgram()
}