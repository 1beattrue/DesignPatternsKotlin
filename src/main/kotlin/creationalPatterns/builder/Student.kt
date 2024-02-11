package creationalPatterns.builder

class Student private constructor(
    private val name: String? = null,
    private val age: Int? = null,
    private val speciality: String? = null
) {
    override fun toString() = "Student(name=$name, age=$age, speciality=$speciality)"

    class Builder { // builder
        private var name: String? = null
        private var age: Int? = null
        private var speciality: String? = null

        fun name(name: String): Builder = apply { this.name = name }

        fun age(age: Int): Builder = apply { this.age = age }

        fun speciality(speciality: String): Builder = apply { this.speciality = speciality }

        fun build(): Student = Student(name, age, speciality)
    }
}