package structuralPatterns.decorator

class KotlinTeamLead(developer: Developer) : DeveloperDecorator(developer) {
    private fun sendWeekReport(): String = "Send week report to customer. "

    override fun makeJob(): String {
        return super.makeJob() + sendWeekReport()
    }
}