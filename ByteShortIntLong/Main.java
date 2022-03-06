package ByteShortIntLong;
// primitive type boolean,byte,char,short,int,long,float.double

public class Main {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer .MIN_VALUE;
        int myMaxIntValue = Integer .MAX_VALUE;
        System.out.println("Interger Minimum Value = " + myMinIntValue);
        System.out.println("IntergercMaximum Value = " + myMaxIntValue);
        // this gives us the max and min of what java goes too

        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        //goes above the amount allowed and does not populate overflow other way is underflow

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        // Smaller number value -128 to 127  less space and quicker to access

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        // -32768 to 32767 number set Short

        // byte 8 bits  short 16 bits and int 32 bits big bigger biggest

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        // very very big to big to put in notes run if you like put L after number to accept big long

        int myTotal = (myMinIntValue / 2);

        // Castiing to trick java and not pull it as a int telling it to treat as (byte)

        byte myNewByteValue = (byte) (myMinByteValue / 2 );

        short myNewshortValue = (short) (myMinShortValue / 2 );

        //Challange time
        byte myB = 127;
        short myS = 31000;
        int myI = 2145765;

        Long L = 50000L + (10 * (myB + myS + myI));
        System.out.println(L);

        // FLoat min and max below Min 1.4E -45  Max 3.4028

        Float myMinFloatValue = Float.MIN_VALUE;
        Float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float MAximum Value = " + myMaxFloatValue);

        // Double Primitive type  Can produce bigger value than Float but much more data 62 bytes comp 32

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2; // Runs as 2 because it only produces whole numbers
        float myFloatValue = 5F / 2F;// you can do (float) 5.25; but most do 5.25F;
        double myDoubleValue = 5D / 2D;// used more than float. Due to accuracy 17 decimal
        // java auto inputs as double if dont specify F or D Float or Double
        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);

        // Challenge conver pounds to killograms
        System.out.println();
        double Pounds = 1;
        double Kilograms = 0.45359237;
        double myPoundsToKilograms = Pounds * Kilograms;
        System.out.println("My conversion is = " + myPoundsToKilograms);












    } // end method
} // end class
