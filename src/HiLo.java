import java.util.Scanner;

public class HiLo {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String playAgain= "";
        int numberOfTries =0;

        do{
        // Create a scanner Object (Scan) that pull input from Keyboard (System.in)
        int theNumber = (int) (Math.random() * 100 + 1);
        // how to create a random number for users to guess
        //we create a variable
        //Math.random generate a random number between 0/0 and 1.0 decimal number
        //we multiply it by 100 increase the to just under 100.0 we add 1 to it to confirm the number is at least 1.0
        //(int) is a type cast or cast it changes the type from decimal to an int.
        // int ths case everything after decimal point is removed, so we get a number between 1 and 100
        // number is stored in theNumber
        //System.out.println(theNumber);
        // print the random number created to user.
        int guess = 0;
        // declare variable and initialise it to

         while(guess!= theNumber) {
             System.out.println("Guess a number between 1 and 100:");
             //we prompt the user to output something
             guess = scan.nextInt();

             // nextInt looks for the next int value
             // the users inputs from the keyboard, store in a var
             numberOfTries ++ ;

             if (guess < theNumber)
                 System.out.println(guess + " Your guess is too low try again");
             else if (guess > theNumber)
                 System.out.println(guess + " Guess is too high try again");

             else
                 System.out.println(guess + " is correct well done simple mortal. you guessed in " + numberOfTries);
             // show what was entered for confirmation

         }
            System.out.println(" Play one more time? (y/n)");
          playAgain = scan.next();
        }while (playAgain.equalsIgnoreCase("y"));
        System.out.println("thank you for playing goodbye");
        scan.close();



    }


}
