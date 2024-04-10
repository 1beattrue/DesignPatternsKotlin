package behavioralPatterns.interpreter

class AndExpression(
    private val expression1: Expression,
    private val expression2: Expression,
) : Expression { // NonterminalExpression
    override fun interpret(context: String): Boolean =
        expression1.interpret(context) && expression2.interpret(context)
}