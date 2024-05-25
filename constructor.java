public class constructor {
    int x;
    //constructor
    public constructor() {
        System.out.println("Constructor called");
        x=5;
    }
    public static void main(String[] args) {
        //creating object
        constructor obj = new constructor();
        System.out.println("Value of x = "+obj.x);
    }
}
