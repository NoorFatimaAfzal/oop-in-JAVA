public class Pen {
    // Class attributes
    private String color;
    private int length;
    private String brand;
    private int inkAmount; // Private attribute

    // Default (package-private) attribute
    String type;

    // Protected attribute
    protected boolean isCapped;

    // Constructor
    public Pen(String color, int length, String brand, String type, boolean isCapped) {
        this.color = color;
        this.length = length;
        this.brand = brand;
        this.inkAmount = 100; // Initially the pen is full of ink
        this.type = type;
        this.isCapped = isCapped;
    }

    // Method to get the color of the pen
    public String getColor() {
        return color;
    }

    // Method to get the length of the pen
    public int getLength() {
        return length;
    }

    // Method to get the brand of the pen
    public String getBrand() {
        return brand;
    }

    // Default (package-private) method
    void displayType() {
        System.out.println("The type of this pen is: " + type);
    }

    // Protected method
    protected void capPen() {
        isCapped = true;
        System.out.println("The pen is now capped.");
    }

    // Private method
    private void write() {
        if (inkAmount > 0) {
            System.out.println("The pen is writing.");
            inkAmount--;
        } else {
            System.out.println("The pen is out of ink.");
        }
    }

    // Use of write in class 
    public void CheckingIfPenWrites(){
        this.write();
    }

    public static void main(String[] args) {
        // Creating object
        Pen myPen = new Pen("Blue", 15, "Bic", "Ballpoint", false);
        // The following line would cause a compile error because write() is a private method
        // myPen.write();
        System.out.println("Color: " + myPen.getColor()); 
        myPen.CheckingIfPenWrites();
        myPen.displayType(); // This would work because displayType() is package-private
        myPen.capPen(); // This would work because capPen() is protected
    }
}