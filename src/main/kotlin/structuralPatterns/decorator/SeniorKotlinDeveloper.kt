package structuralPatterns.decorator

class SeniorKotlinDeveloper(developer: Developer) : DeveloperDecorator(developer) {
    private fun makeCodeReview(): String = "Make code review. "

    override fun makeJob(): String {
        return super.makeJob() + makeCodeReview()
    }
}