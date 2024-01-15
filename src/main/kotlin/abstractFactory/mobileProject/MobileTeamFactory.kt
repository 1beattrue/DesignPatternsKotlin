package abstractFactory.mobileProject

import abstractFactory.Developer
import abstractFactory.ProjectManager
import abstractFactory.ProjectTeamFactory
import abstractFactory.Tester

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