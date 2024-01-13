package abstractfactory.mobileproject

import abstractfactory.Developer
import abstractfactory.ProjectManager
import abstractfactory.ProjectTeamFactory
import abstractfactory.Tester

class MobileTeamFactory : ProjectTeamFactory {
    override fun getDeveloper(): Developer {
        return MobileDeveloper()
    }

    override fun getTester(): Tester {
        return MobileTester()
    }

    override fun getProjectManager(): ProjectManager {
        return MobileProjectManager()
    }
}