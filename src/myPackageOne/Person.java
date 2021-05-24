package myPackageOne;

import AnimalPackage.Animal;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Animal animal;

    public Person(String name, String surname, int age) {
          this.name = name;
          this.surname = surname;
          this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getInfo(){
        return "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n"+
                "Age: " + this.age + "\n" +
                "Animal info: " + animal.getAnimalInfo();
    }


}
