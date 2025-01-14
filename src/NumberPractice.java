public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negFloat = -1.5F;
    System.out.println(negFloat);
    // Create an int with a positive value and assign it to a variable
    int posInt = 7;
    System.out.println(posInt);
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = 1 % 3;
    System.out.println(remainder);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (posInt % 2 == 0) {
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }
    // Divide the number by another number using integer division
    int dividedInt = posInt / 2;
    System.out.println(dividedInt);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
