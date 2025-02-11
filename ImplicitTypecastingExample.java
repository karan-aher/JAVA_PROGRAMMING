public class ImplicitTypecastingExample {
    public static void main(String args[]) {
        byte p = 12;
        short q = p;
        int r = q;
        long s = r;
        float t = s;
        double u = t;

        System.out.println("Byte value: " + p);
        System.out.println("Short value: " + q);
        System.out.println("Int value: " + r);
        System.out.println("Long value: " + s);
        System.out.println("Float value: " + t);
        System.out.println("Double value: " + u);
    }
}