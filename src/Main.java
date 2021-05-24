import AnimalPackage.*;
import myPackageOne.*;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Make", "Brown", 23);
        Animal dog = new Dog("Belo");
        p1.setAnimal(dog);

        String res = p1.getInfo();
        System.out.println(res);

    }
}
