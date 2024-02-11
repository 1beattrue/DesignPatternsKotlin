package creationalPatterns.factoryMethod

class JavaDeveloperFactory : DeveloperFactory {
    override fun createDeveloper(): Developer = JavaDeveloper()
}