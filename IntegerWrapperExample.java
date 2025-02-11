public class IntegerWrapperExample {
    public static void main(String[] args) {
    
        Integer num1 = 10;
        Integer num2 = 20;

        
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

        int compareResult = num1.compareTo(num2);
        System.out.println("Comparison result: " + compareResult);

        boolean isEqual = num1.equals(num2);
        System.out.println("Equality check: " + isEqual);

        
        String str = "100";
        int parsedInt = Integer.parseInt(str);
        System.out.println("Parsed integer: " + parsedInt);

        
        String strNum1 = num1.toString();
        System.out.println("String representation of num1: " + strNum1);

        
        Integer valueOfNum = Integer.valueOf(str);
        System.out.println("Integer value of string: " + valueOfNum);


        int hashCodeNum1 = num1.hashCode();
        System.out.println("HashCode of num1: " + hashCodeNum1);
    }
}
