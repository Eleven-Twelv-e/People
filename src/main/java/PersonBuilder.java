public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String adress;


    public PersonBuilder setName(String name) {
        if (this.name == null){
            this.name = name;
        }
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        if (this.surname == null){
            this.surname = surname;
        }else {
            throw new IllegalStateException("Unacceptable age");
        }
        return  this;
    }
    public PersonBuilder setAge(int age) {
        if (age >= 0 && age <= 90){
            this.age = age;
        }
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return this;
    }

    public Person build() {
        if (name == null){
            throw new IllegalStateException("Fill in the name tab");
        }
        if (surname == null){
            throw new IllegalStateException("Fill in the surname tab");
        }

        return new Person(name, surname, age, adress);
    }
}