package abstractfactory.webproject

import abstractfactory.Developer

class WebDeveloper : Developer {
    override fun writeCode() {
        println("Web developer writes web code...")
    }
}