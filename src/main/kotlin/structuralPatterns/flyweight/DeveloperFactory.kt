package structuralPatterns.flyweight

import java.lang.RuntimeException

class DeveloperFactory { // flyweight factory
    fun getDeveloperBySpeciality(speciality: String): Developer {
        var developer = developers[speciality]
        if (developer == null) {
            when (speciality) {
                "java" -> {
                    println("Hiring Java developer")
                    developer = JavaDeveloper()
                }

                "kotlin" -> {
                    println("Hiring Kotlin developer")
                    developer = KotlinDeveloper()
                }
            }
            developers[speciality] = developer ?: throw RuntimeException("unknown speciality")
        }
        return developer
    }

    companion object {
        private val developers: MutableMap<String, Developer> = mutableMapOf()
    }
}