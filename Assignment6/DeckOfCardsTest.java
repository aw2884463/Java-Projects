// Fig. 7.13: DeckOfCardsTest.java
// Card shuffling and dealing.
import java.time.LocalDateTime;

public class DeckOfCardsTest {
   // execute application
   public static void main(String[] args) {
      Card[] hand = new Card[5];
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place Cards in random order
      
      // Deal 5 card hand
      for (int i = 1; i <= 5; i++) {
         // deal and display a Card
         hand[i - 1] = myDeckOfCards.dealCard();
         System.out.println("Card " + i + ": " + hand[i - 1]);

      }


      // Check for a pair in hand
      if (myDeckOfCards.checkForPairInHand(hand)) {
         System.out.println("There is a pair in the hand.");
      }
      else {
         System.out.println("There is no pair in the hand.");
      }

      // Check for two pairs in hand

      if (myDeckOfCards.checkForTwoPairsInHand(hand)) {
         System.out.println("There is two pairs in the hand.");
      }
      else {
         System.out.println("There is not two pairs in the hand.");
      }

      // Check for three of a kind in hand

      if (myDeckOfCards.checkThreeOfAKind(hand)) {
         System.out.println("There is a three of a kind in the hand.");
      }
      else {
         System.out.println("There is no three of a kind in the hand.");
      }

      // Check for a four of a kind in hand

      if (myDeckOfCards.checkFourOfAKind(hand)) {
         System.out.println("There is a four of a kind in the hand.");
      }
      else {
         System.out.println("There is no four of a kind in the hand.");
      }

      //Check for a full house in hand

      if (myDeckOfCards.checkForFullHouse(hand)) {
         System.out.println("There is a full house in the hand.");
      }
      else {
         System.out.println("There is no full house in the hand.");
      }

      // Check for a flush in hand

      if (myDeckOfCards.checkForFlush(hand)) {
         System.out.println("There is a flush in the hand.");
      }
      else {
         System.out.println("There is no flush in the hand.");
      }

      //Check for a straight in hand

      if (myDeckOfCards.checkForStraight(hand)) {
         System.out.println("There is a straight in the hand.");
      }
      else {
         System.out.println("There is no straight in the hand.");
      }

      System.out.printf("Thank you for using the Card Shuffling and Dealing application%n");
      LocalDateTime time = LocalDateTime.now();
      System.out.printf("%s%s%n", "Time of calculation is: ", time);
      System.exit(0);

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
