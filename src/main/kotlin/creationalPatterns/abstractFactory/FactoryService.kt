package creationalPatterns.abstractFactory

import creationalPatterns.abstractFactory.mobileProject.MobileTeamFactory
import creationalPatterns.abstractFactory.webProject.WebTeamFactory
import java.lang.RuntimeException

class FactoryService {
    companion object {
        fun createProjectTeamFactoryByPlatform(platform: String): ProjectTeamFactory {
            return when (platform) {
                "web" -> WebTeamFactory()
                "mobile" -> MobileTeamFactory()
                else -> throw RuntimeException("Unknown platform: $platform")
            }
        }
    }
}