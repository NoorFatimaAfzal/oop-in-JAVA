public class first {
    // Constructor
    public first(){
        System.out.println("Constructor called! ");
    }
    // learning polymorphism 
    public String polymorphism(){
        return "Polymorphism is the ability of an object to take on many forms";
    }
    public int polymorphism(int x){
        return x;
    }
    public String polymorphism(String x){
        return x;
    }
    public static void main(String[] args) {
        first obj = new first();
        System.out.println(obj.polymorphism());
        System.out.println(obj.polymorphism(5));
        System.out.println(obj.polymorphism("Hello"));
    }
}


/* 
it shows k user k pass kiye hoy parameters k mutabiq function call hota hai 
additionally, it shows k ek function k multiple forms hote hain

Advantages of polymorphism in daily life:

1. Polymorphism allows objects to be treated as a parent class so that a single class can have multiple forms.
2. It allows you to define one interface and have multiple implementations.
3. It allows you to perform a single action in different ways.
4. It allows you to perform different implementations of a method that is already defined in the parent class.
5. It allows you to define a method in the child class with the same name as defined in the parent class.
6. It allows you to override a method in the child class that is already defined in the parent class.

 */ 