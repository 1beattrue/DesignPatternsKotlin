package creationalPatterns.abstractFactory.webProject

import creationalPatterns.abstractFactory.Developer
import creationalPatterns.abstractFactory.ProjectManager
import creationalPatterns.abstractFactory.ProjectTeamFactory
import creationalPatterns.abstractFactory.Tester

class WebTeamFactory : ProjectTeamFactory {
    override fun getDeveloper(): Developer {
        return WebDeveloper()
    }

    override fun getTester(): Tester {
        return WebTester()
    }

    override fun getProjectManager(): ProjectManager {
        return WebProjectManager()
    }
}