public class test_Access_modefiers {
    // Private Attributes
    private String name;
    private int age;
    private boolean isMale;
    // prublic attributes
    public String address;
    public int phone;
    public boolean isMarried;
    // Private method
    private int getAge() {
        return age;
    }
    // Public method
    public void displayAddress() {
        System.out.println("The address is: " + address);
    }
    public static void main(String[] args) {
        // Creating an object of the Pen class
        test_Access_modefiers person = new test_Access_modefiers();
        // Setting the attributes
        person.name = "John";
        person.age = 30;
        person.isMale = true;
        person.address = "123 Main St, New York, NY";
        person.phone = 1234567890;
        person.isMarried = false;
        // Getting the attributes
        System.out.println("Name: " + person.name);
        //getting the address via method
        person.displayAddress();
        //getting the age via method
        System.out.println("Age: " + person.getAge());
    }
}
