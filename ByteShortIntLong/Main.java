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







    } // end method
} // end class
