package structuralPatterns.facade

class IntelliJIdeaFacade( // facade
    private val textEditor: TextEditor,
    private val compiler: Compiler,
    private val jvm: Jvm
) {
    fun start() {
        textEditor.createCode()
        textEditor.save()
        compiler.compile()
        jvm.execute()
    }

    fun stop() {
        jvm.finish()
    }
}