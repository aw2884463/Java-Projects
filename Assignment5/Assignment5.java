import java.security.SecureRandom;
import java.time.LocalDateTime;

public class Assignment5 {

    private static final SecureRandom randomNumbers = new SecureRandom();
    public static void main(String[] args) {

        int[] values = new int[11];

        for(int i = 0; i < 36000000;i++) {

            values[setIndex(rollDice())] += 1;
        }
        for(int i = 0; i < 11;i++) {

            System.out.printf("%d was rolled %d%n", i + 2, values[i]);
        }

        System.out.printf("Thank you for using the dice rolling application%n");
        LocalDateTime time = LocalDateTime.now();
        System.out.printf("%s%s%n", "Time of calculation is: ", time);
    }

    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll
  
        int sum = die1 + die2; // sum of die values
  
        return sum; 
     }

     public static int setIndex(int value) {

        int index;

        index = value - 2;

        return index;
     }
}
