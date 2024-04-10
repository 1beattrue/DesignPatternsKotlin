package behavioralPatterns.interpreter

interface Expression { // AbstractExpression
    fun interpret(context: String): Boolean
}