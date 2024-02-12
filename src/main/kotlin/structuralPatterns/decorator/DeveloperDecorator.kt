package structuralPatterns.decorator

open class DeveloperDecorator( // decorator
    private val developer: Developer
) : Developer {
    override fun makeJob(): String = developer.makeJob()
}