public class ExpressionsOperators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Bitwise Operators
        int c = 6; // 110 in binary
        int d = 4; // 100 in binary
        System.out.println("c & d: " + (c & d)); // Bitwise AND
        System.out.println("c | d: " + (c | d)); // Bitwise OR
        System.out.println("c ^ d: " + (c ^ d)); // Bitwise XOR
        System.out.println("~c: " + (~c)); // Bitwise NOT
        System.out.println("c << 1: " + (c << 1)); // Left shift
        System.out.println("c >> 1: " + (c >> 1)); // Right shift

        // Assignment Operators
        int e = 10;
        e += 5; // e = e + 5
        System.out.println("e += 5: " + e);
        e -= 3; // e = e - 3
        System.out.println("e -= 3: " + e);
        e *= 2; // e = e * 2
        System.out.println("e *= 2: " + e);
        e /= 4; // e = e / 4
        System.out.println("e /= 4: " + e);
        e %= 3; // e = e % 3
        System.out.println("e %= 3: " + e);

        // Unary Operators
        int f = 10;
        System.out.println("f++: " + (f++)); // Post-increment
        System.out.println("++f: " + (++f)); // Pre-increment
        System.out.println("f--: " + (f--)); // Post-decrement
        System.out.println("--f: " + (--f)); // Pre-decrement
    }
}
/*
OUTPUT
======
a + b = 15
a - b = 5
a * b = 50
a / b = 2
a % b = 0
a == b: false
a != b: true
a > b: true
a < b: false
a >= b: true
a <= b: false
x && y: false
x || y: true
!x: false
c & d: 4
c | d: 6
c ^ d: 2
~c: -7
c << 1: 12
c >> 1: 3
e += 5: 15
e -= 3: 12
e *= 2: 24
e /= 4: 6
e %= 3: 0
f++: 10
++f: 12
f--: 12
--f: 10

 */