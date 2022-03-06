package Operators;

public class Main {
    public static void main(String[] args) {

        //operators special symbols that return a result + =
        //operand int myvar = 15 + 12   operands are 15 and 12
        //expression formed by combining them above and others to produce a result

        int result = 1 + 2; // 1 + 2 = 3 = is used to assign a value two operands
        System.out.println("1 + 2 = " + result); // put 1+2 to print properly
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);
  // Module operator remainder of two operands
        result = result % 3; // this should be giving remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);


        // result = result + 1;
        result++; // 1 + 1 = 2      ++ means plus one
        System.out.println("1 + 1 = " + result);

        result--; // 2-1 = 1     -- take away one
        System.out.println(" 2 - 1 = " + result);

        // result equals result plus two this is how abbriviate it
        result += 2; // result plus 2    sames as result = result + 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 *10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // if and statement tells to write code if true to the statement
        //condition logic specific state to allow us to check condition true or false

        boolean isAlien = false; // assignment operator the =
        if (isAlien == true) {
            // testing to see if value is false no semicolon don't close line will all exec
            System.out.println("It is not and Alien!");
            System.out.println("And I am scared of aliens");
        } // code block allows more than one statement to be executed use {} curly braces

        int topScore = 80;
        if (topScore == 100){ // != not equal to  > greater than
            System.out.println("You got the high score!");
        }

        int secondTopScore = 79;
        if (topScore > secondTopScore && topScore < 100 ){// && makes sure both operands are set to true
            System.out.println("Greater than second top score and less than 100");
        }









    } //end method
} //end class
