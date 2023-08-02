class Patient {
    def firstName, lastName, age
    def static type = 1;

    void setLastName(lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Last Name cannot be null")
        }
        this.lastName = lastName
    }

    static void display() {
        println type
    }
}

p = new Patient(lastName:'Mello',age:34)
p.firstName = 'Raphael'
println p.firstName + " " + p.lastName + " " + p.age
Patient.display()
