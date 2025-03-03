// Practical No 09 Implement Interface
interface Polygon {
    void getArea(int length, int breadth);
}

// Implement the Polygon interface
class Rectangle implements Polygon {

    // Implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

class Interfaces{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }
}