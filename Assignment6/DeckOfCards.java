// Fig. 7.12: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.
import java.security.SecureRandom;

public class DeckOfCards {
   // random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();
   private static final int NUMBER_OF_CARDS = 52; // constant # of Cards

   private Card[] deck = new Card[NUMBER_OF_CARDS]; // Card references
   private int currentCard = 0; // index of next Card to be dealt (0-51)

   // constructor fills deck of Cards
   public DeckOfCards() {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};    
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};      

      // populate deck with Card objects                   
      for (int count = 0; count < deck.length; count++) {  
         deck[count] =                                     
            new Card(faces[count % 13], suits[count / 13]);
      }                                                    
   } 

   // shuffle deck of Cards with one-pass algorithm
   public void shuffle() {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0; 

      // for each Card, pick another random Card (0-51) and swap them
      for (int first = 0; first < deck.length; first++) {
         // select a random number between 0 and 51 
         int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

         // swap current Card with randomly selected Card
         Card temp = deck[first];   
         deck[first] = deck[second];
         deck[second] = temp;       
      } 
   } 

   // deal one Card
   public Card dealCard() {
      // determine whether Cards remain to be dealt
      if (currentCard < deck.length) {
         return deck[currentCard++]; // return current Card in array
      } 
      else {
         return null; // return null to indicate that all Cards were dealt
      } 
   }
   
   // Check for a pair in hand
   public boolean checkForPairInHand(Card[] hand) {
      for (int i = 0; i < hand.length - 1; i++) {
         for (int j = i + 1; j < hand.length; j++) {
            if (checkPair(hand[i], hand[j])) {
               return true;
            }
         }
      }
      return false;
   }

   // Check for two different pairs in hand
   public boolean checkForTwoPairsInHand(Card[] hand) {
      int count = 0;
      for (int i = 0; i < hand.length - 1; i++) {
         for (int j = i + 1; j < hand.length; j++) {
            if (checkPair(hand[i], hand[j])) {
               count++;
            }
         }
      }
      if (count == 2) {
         return true;
      }
      else {
         return false;
      }
   }


   // Compare two cards
   public boolean checkPair(Card card1, Card card2) {
      if (card1.getFace().equals(card2.getFace())) {
         return true;
      }
      return false;
   }

   // Check for a three of a kind in hand
   public boolean checkThreeOfAKind(Card[] hand) {
      for (int i = 0; i < hand.length - 2; i++) {
         if (checkPair(hand[i], hand[i + 1])) {
            if (checkPair(hand[i], hand[i + 2])) {
               return true;
            }
         }
      }
      return false;
   }

   // Check for a flush in hand
   public boolean checkForFlush(Card[] hand) {
      for (int i = 0; i < hand.length - 1; i++) {
         if (!hand[i].getSuit().equals(hand[i + 1].getSuit())) {
            return false;
         }
      }
      return true;
   }

   // Check for a straight in hand v1

   // public boolean checkForStraight(Card[] hand) {

   //    String faceValue = "";
   //    faceValue = hand[0].getFace();
   //    for (int i = 1; i < hand.length; i++) {
   //       if (!faceValue.equals(hand[i].getFace())) {
   //          return false;
   //       }
   //    }
   //    return true;
   // }

   // Check for straight in hand v2

   public boolean checkForStraight(Card[] hand) {
      for (int i = 0; i < hand.length - 1; i++) {
         if (!hand[i].getFace().equals(hand[i + 1].getFace())) {
            return false;
         }
      }
      return true;
   }

   // Check for a full house in hand
   public boolean checkForFullHouse(Card[] hand) {
         if (checkThreeOfAKind(hand)) {
            if (checkForPairInHand(hand)) {
               return true;
            }
      }
      return false;
   }

   // Check for a four of a kind in hand
   public boolean checkFourOfAKind(Card[] hand) {
      for (int i = 0; i < hand.length - 3; i++) {
         if (checkPair(hand[i], hand[i + 1])) {
            if (checkPair(hand[i], hand[i + 2])) {
               if (checkPair(hand[i], hand[i + 3])) {
                  return true;
               }
            }
         }
      }
      return false;
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
