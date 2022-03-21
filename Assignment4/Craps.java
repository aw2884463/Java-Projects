// Fig. 5.8: Craps.java
// Craps class simulates the dice game craps.
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;

public class Craps {
   // create secure random number generator for use in method rollDice
   private static final SecureRandom randomNumbers = new SecureRandom();
   public static int balance = 1000;
   public static int bet = 9999;

   // enum type with constants that represent the game status
   private enum Status {CONTINUE, WON, LOST};                

   // constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;      
   private static final int SEVEN = 7;     
   private static final int YO_LEVEN = 11; 
   private static final int BOX_CARS = 12; 

   // plays one game of craps
   public static void main(String[] args) {
      int myPoint = 0; // point if no win or loss on first roll
      Status gameStatus; // can contain CONTINUE, WON or LOST
      makeBet();
      int sumOfDice = rollDice(); // first roll of the dice
      // determine game status and point based on first roll 
      switch (sumOfDice) {
         case SEVEN: // win with 7 on first roll    
         case YO_LEVEN: // win with 11 on first roll
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: // lose with 2 on first roll
         case TREY: // lose with 3 on first roll      
         case BOX_CARS: // lose with 12 on first roll 
            gameStatus = Status.LOST;
            break;
         default: // did not win or lose, so remember point  
            gameStatus = Status.CONTINUE; // game is not over
            myPoint = sumOfDice; // remember the point       
            System.out.printf("Point is %d%n", myPoint);
            break; 
      }

      // while game is not complete
      while (gameStatus == Status.CONTINUE) { // not WON or LOST
         sumOfDice = rollDice(); // roll dice again

         // determine game status
         if (sumOfDice == myPoint) { // win by making point
            gameStatus = Status.WON;
         } 
         else { 
            if (sumOfDice == SEVEN) { // lose by rolling 7 before point
               gameStatus = Status.LOST;
            } 
         } 
      } 
      banter();
      // display won or lost message
      if (gameStatus == Status.WON) {
         System.out.println("Player wins");
         forceBet(1);
      } 
      else {
         System.out.println("Player loses");
         forceBet(0);
      }
      System.out.printf("%s%d%n", "Your balance is now at $", balance);

      System.out.printf("%s%n", "Thank you for using the casino application");
      LocalDateTime time = LocalDateTime.now();
      System.out.printf("%s%s%n", "Time of calculation is: ", time);

      System.exit(0);
   } 

   // roll dice, calculate sum and display results
   public static int rollDice() {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      // display results of this roll
      System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

      return sum; 
   }

   public static void makeBet() 
   {
      Scanner input = new Scanner(System.in);
      System.out.printf("%s%d%n", "Your balance is $", balance);
      System.out.printf("%s%n", "What amount would you like to bet");

      while (bet > balance) 
      {
         bet = input.nextInt();
         if (bet <= balance) 
         {
            System.out.printf("%s%n", "Nice place your bet has been recorded!");
            break;
         } 
         else 
         {
            System.out.printf("%s%n", "Please enter a valid amount!");
         }
      }
      input.close();
   }

   public static void forceBet(int stat) 
   {
      if (stat == 1) {
         balance += bet;
      } 
      else {
         balance -= bet;
         if(balance <= 0) {
            System.out.printf("%s%n", "Sorry, You Busted!");
         }
      }
   }
   
   public static void banter() {

      Random rand = new Random();
      int vRand = rand.nextInt(2000);
      if(vRand > 250 && vRand <= 800) {
         System.out.printf("%s%n", "You better make some money moves your running low!");
      }
      else if (vRand > 800 && vRand <= 1250) {
         System.out.printf("%s%n", "You've been playing it safe why don't you live a little take a risk!");
      }
      else if (vRand > 1250 && vRand <= 1750){
         System.out.printf("%s%n", "Alrighty your making a little progress!"); 
      }
      else {
         System.out.printf("%s%n", "Big Money Big Money Big Money!");
      }
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
