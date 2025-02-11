import java.util.*;

public class Evenodd {
    public static void main(String[] args) {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        no = sc.nextInt();
        if (no%2==0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        
        }
    }
}
   /*
     OUTPUT    
     ========
     Enter a Number
     5
     Odd Number
    */