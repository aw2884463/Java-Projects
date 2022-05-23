import java.io.IOException;
import java.time.LocalDateTime;

//Exception subclassing
public class ExceptionSubclass{
   public static void main(String[] args) {
      String myString = null;
      try {
         myString.length();
      } catch (NullPointerException e) {
         System.out.println("NullPointerException was thrown\n");
      }
      try {
         throw new IOException("IOException was thrown");
      } catch (IOException e) {
         System.out.println("IOException was thrown\n");
      }
      try {
         throw new ExceptionA("ExceptionA was thrown");
      } catch (ExceptionA e) {
         System.out.println("ExceptionA was thrown\n");
      }
      try {
         throw new ExceptionB("ExceptionB was thrown");
      } catch (ExceptionB e) {
         System.out.println("ExceptionB was thrown\n");
      }

      System.out.printf("%s%n", "Thank you for using the Exception application.");
      LocalDateTime time = LocalDateTime.now();
      System.out.printf("%s%s%n", "Time of calculation is: ", time);
      System.exit(0);
   } 
} 
// subclasses of Exception
class ExceptionA extends Exception {
   public ExceptionA(String message) {
      super(message);
   }
}
class ExceptionB extends ExceptionA {
   public ExceptionB(String message) {
      super(message);
   }
} 