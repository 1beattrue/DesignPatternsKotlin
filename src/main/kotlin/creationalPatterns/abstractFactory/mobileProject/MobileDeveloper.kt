package creationalPatterns.abstractFactory.mobileProject

import creationalPatterns.abstractFactory.Developer

class MobileDeveloper : Developer {
    override fun writeCode() {
        println("Mobile developer writes mobile code...")
    }
}