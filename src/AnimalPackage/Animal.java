package AnimalPackage;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalInfo(){
        return "'Name' " + this.name;
    }
}
