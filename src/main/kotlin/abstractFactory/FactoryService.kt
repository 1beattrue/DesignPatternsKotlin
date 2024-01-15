package abstractFactory

import abstractFactory.mobileProject.MobileTeamFactory
import abstractFactory.webProject.WebTeamFactory
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