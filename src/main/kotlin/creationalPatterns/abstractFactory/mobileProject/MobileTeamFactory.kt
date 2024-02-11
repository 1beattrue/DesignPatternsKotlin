package creationalPatterns.abstractFactory.mobileProject

import creationalPatterns.abstractFactory.Developer
import creationalPatterns.abstractFactory.ProjectManager
import creationalPatterns.abstractFactory.ProjectTeamFactory
import creationalPatterns.abstractFactory.Tester

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