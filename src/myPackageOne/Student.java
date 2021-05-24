package myPackageOne;

public class Student extends Person{
   private String index;

    public Student(String name, String surname,int age,String index){
        super(name,surname,age);
        this.index = index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Index Nr. " + this.index;
    }
}
