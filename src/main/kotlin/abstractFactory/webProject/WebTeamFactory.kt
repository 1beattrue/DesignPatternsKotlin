package abstractFactory.webProject

import abstractFactory.Developer
import abstractFactory.ProjectManager
import abstractFactory.ProjectTeamFactory
import abstractFactory.Tester

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