package behavioralPatterns.interpreter

class TerminalExpression(
    private val data: String
) : Expression { // TerminalExpression
    override fun interpret(context: String): Boolean = context.contains(data)
}