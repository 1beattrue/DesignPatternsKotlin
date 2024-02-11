package creationalPatterns.abstractFactory.webProject

import creationalPatterns.abstractFactory.Developer

class WebDeveloper : Developer {
    override fun writeCode() {
        println("Web developer writes web code...")
    }
}