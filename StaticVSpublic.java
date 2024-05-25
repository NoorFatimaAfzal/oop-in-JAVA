public class StaticVSpublic {
    //static method
    static void display() {
        System.out.println("Static method");
    }
    //public method
    public void show() {
        System.out.println("Public method");
    }
    public static void main(String[] args) {
        //calling static method
        display();
        //calling public method without creating object will raise an error
        
        //creating object
        StaticVSpublic obj = new StaticVSpublic();
        //calling public method
        obj.show();
    }
}