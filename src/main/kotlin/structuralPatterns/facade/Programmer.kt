package structuralPatterns.facade

class Programmer {
    fun createApplication(intelliJIdeaFacade: IntelliJIdeaFacade) {
        intelliJIdeaFacade.start()
        intelliJIdeaFacade.stop()
    }
}