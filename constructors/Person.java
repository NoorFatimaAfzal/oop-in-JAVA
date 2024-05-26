package constructors;
public class Person {

    // Private Attributes
    private String name;
    private int age;
    private String address;

    // Non parametrized constructor
    public Person(){
        this.name = "Noor";
        this.age = 19;
        this.address = "Wazirabad";
    }
    // Parametrized Constructor
    public Person(String name , int age , String address){
        this.name= name;
        this.age=age;
        this.address = address;
    }

    private void displayDetails(){
        System.out.println("Name: " + this.name);
    }
    public static void main(String[] args) {
        Person noor =new Person();
        noor.displayDetails();
        Person iqra = new Person("Iqra", 20, "Lahore");
        iqra.displayDetails();
    }
}
