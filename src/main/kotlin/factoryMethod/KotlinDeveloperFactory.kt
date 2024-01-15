package factoryMethod

class KotlinDeveloperFactory : DeveloperFactory {
    override fun createDeveloper(): Developer = KotlinDeveloper()
}