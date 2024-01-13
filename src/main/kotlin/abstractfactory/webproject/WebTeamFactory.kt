package abstractfactory.webproject

import abstractfactory.Developer
import abstractfactory.ProjectManager
import abstractfactory.ProjectTeamFactory
import abstractfactory.Tester

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