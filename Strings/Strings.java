package Strings;

public class Strings {
    public static void main(String[] args) {
      // 8 primitive types
        // byte
        // short
        // int
        // long
        // float
        // double
        // boolean

        // string is a datatype not primitive
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("mystring is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);// it does not add the number just puts together 250.5549.95
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);// 1050 even though we used int
        double doubleNumber = 120.47D;
        lastString = lastString + doubleNumber;
        System.out.println(" LastString is equal to " + lastString);
        // cant change a string after created just make a new string







    } // End main
}// End class
