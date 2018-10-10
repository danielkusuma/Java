import java.util.logging.SocketHandler;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*// Methods in Java (see bottom file)
        // calculateScore(true, 800, 5, 100);
        // calculateScore(false, 400, 5, 30);
        int playerScore = calculateHighScorePosition(300);
        displayHighScorePosition("daniel", playerScore);*/
        /*
        // Code Blocks and if then else control statement
        int score = 500;
        int levelCompleted = 8;
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
    }*/
}

