import org.jetbrains.annotations.Contract;
import sun.awt.geom.AreaOp;
import javax.naming.ldap.UnsolicitedNotification;
import java.sql.SQLOutput;
import java.util.logging.SocketHandler;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Car mazda = new Car();
//        mazda.setModel("3");
//        System.out.println("Model is " + mazda.getModel());
        }
}
        /*
        // Classes

        */
        /*
        // Constructor
        // Create new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds ( this should increment the balance field).
        // 2. To allow the customer to withdraw funds, This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds,
        // You will want to create various code in the Main class ( the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well

//        Bank DanBank = new Bank();
//        System.out.println(DanBank.getAccNumber());
//        DanBank.deposit(5000);
//        DanBank.withdraw(100);
//        DanBank.withdraw(4902);
        // Create a new class VIPCustomer
        // It should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works
//        VipCustomer vip2 = new VipCustomer();
//        System.out.println(vip2.getName());
//        System.out.println(vip2.getCreditLimit());
//
//        VipCustomer vip1 = new VipCustomer("defaultName0", 1000, "default1@mail.com");
//        System.out.println(vip1.getName());
//
//        VipCustomer vip3 = new VipCustomer(100, "default3@mail.com");
//        System.out.println(vip3.getName());
//        System.out.println(vip3.getEmailAddress());
        */
        /*
        // while loop
        int count = 0;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
        int number = 1;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (isEvenNumber(number) == true)
            {
                count++;
                System.out.println("Even number:" + number + " Total Number:" + count);
            } else if (number == 5) {
                break;
            }
        }
        */
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not
        // return true if an even number, otherwise return false

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

    /*
    // while loop
    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    */
            /*
            // For Statement
            System.out.println("10k at 10% interest: " + calculateInterest(1000, 10));
            for (int i = 0; i < 5; i++) {
                System.out.println("Loop: " + i + " hello");
            }
// Using the statement, call the calculateInterest method with
// the amount of 10000 with an interestRate of 2, 3, 4, 5, 6, 7, 8
// and print the results to the console window.
            for (int i = 2; i < 9; i++) {
                System.out.println("10k at " + i + " interest: " + String.format("%.2f", calculateInterest(10000, i)));
            }

// How would you modify the for loop above to do the same thing as
// shown but to start from 8% and work back to 2%
            for (int j = 8; j > 1; j--) {
                System.out.println("10k at " + j + " interest: " + String.format("%.2f", calculateInterest(10000, j)));
            }

// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit for the loop
// hint: use the break; statement to exit
            int count = 0;
            for (int i = 50; i < 200; i++) {
                if (isPrime(i) == true) {
                    System.out.println(i);
                    System.out.println("It is a prime number");
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
            }
*/
        /*
        // if else
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if ( value == 2 ) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }
        // switch
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value  was 3/4/5");
                System.out.println("Actually It was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        // Challenge
        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for A, B, C, D, E
        // Display a message if any of these are found and then break
        // Add a default which displays a message saying not found
        char switchChar = 'A';
        switch (switchChar) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("Not found");
                break;
        }
        // string switch
        String choice = "january";
        switch(choice.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            case "Feb":
                System.out.println("Feb");
                break;
        }
        */
        /*
        // Methods in Java (see bottom file)
        // calculateScore(true, 800, 5, 100);
        // calculateScore(false, 400, 5, 30);
        int playerScore = calculateHighScorePosition(300);
        displayHighScorePosition("daniel", playerScore);*/
        /*
        // Code Blocks and if then else control statement
        int score = 500;
        int levelCompleted = 8;/..l;
        int bonus = 200;
        if (score == 5000) {
            System.out.println("Your score is 5000");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got here");
        }
        boolean gameOver = true;

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        boolean newGameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (newGameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // cannot read this code block
        // int savedFinalScore = finalScore;

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well
        */
        /*
        // Operators
        int result = 10 / 2;
        System.out.println(result);
        result = result % 2;
        System.out.println(result);
        result--;
        System.out.println(result);
        result++;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 10;
        System.out.println(result);
        boolean isHuman = false;
        if (isHuman = false) {
            System.out.println("It's not human");
        } else {
            System.out.println("It's human");
        }
        int topScore = 105;
        if (topScore < 100) {
            System.out.println("Score = less than 100");
        } else {
            System.out.println("Score is 100 or more");
        }
        int score = 50;
        if ((score < topScore) &&(topScore < 200)){
            System.out.println("You score less than topScore");
        } else if ((score < topScore) || (topScore < 100)){
            System.out.println("You score more than topScore");
        } else ((score < topScore) && (topScore > 100)) {
            System.out.println("This will produce a text");
        }
        boolean isCoupe = true;
        boolean isCar = isCoupe ? false : true;
        if (isCar) {
            System.out.println("Car is coupe");
        }
        */
        /*
        // String and Finishing Prim. Data Type
        // Primitive type: byte, short, int, long, float, double, char, boolean
        // String = sequence of character
        String myString = "This is my string";
        // This will be treated as a string
        String myNumberString = "200";
        */
        /*
        // Char and Boolean
        // Char can only have 1 character
        char myChar = 'D';
        char myUnicode = '\u00A9';
        System.out.println(myUnicode);
        // Boolean
        boolean myBoolean = false;
        boolean isMale = true;
        */
        /*
        // Float and Double
        // float is single precision
        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);
        */
        /*
        // Primitive Data Types
        // Int has a width of 32 (most used)
        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;
        // Byte is more efficient (width = 8)
        byte minByte = -128;
        byte maxByte = 127;
        // Has to be byte
        byte myNewByte = (byte)(minByte/2);
        System.out.println(myNewByte);
        // Short cost twice of byte's space (width = 16)
        short minShort = -32768;
        short maxShort = 31767;
        // long has a width of 64
        long maxLong = 9_223_372_036_854_775_807L;
        // Create a variable of type long, and make it equal to 500 + 10 times the sum of the byte, plus the short plus the int
        long longTotal = 500L + 10L * (maxByte + maxShort + maxInt);
        System.out.println(longTotal);
        */
        /*
        // Variables
        int myFirstNumber = 10 + 200 * 2 + (20 + 5);
        int mySecondNumber = 5;
        System.out.println(myFirstNumber);
        int myTotal = myFirstNumber + mySecondNumber;
        int lastNumber = myTotal - myFirstNumber;
        System.out.println(lastNumber);
        */
        /*
        // My First App
        System.out.println("Hello World");
        */
//    }

//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
//    }
    /*public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }*/
    /*public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int playerScore;
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;

        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            System.out.println(i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
    */

