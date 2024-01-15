package abstractFactory

interface ProjectTeamFactory { // абстрактная фабрика
    fun getDeveloper(): Developer
    fun getTester(): Tester
    fun getProjectManager(): ProjectManager
}