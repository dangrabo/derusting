import java.util.*;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myString = "daniel";
    System.out.println("myString is - " + myString);
    // Find the length of the string
    System.out.println("The length of myString is - " + myString.length());
    // Concatenate (add) two strings together and reassign the result
    String myStringTwo = "grabowski";
    String fullname = myString + myStringTwo;
    System.out.println("The concatenated string is - " + fullname);
    // Find the value of the character at index 3
    System.out.println("The value of the character at index 3 is - " + myString.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if (myString.contains("dan")) {
      System.out.println("myString does contain substring 'dan'");
    }
    else {
      System.out.println("myString does not contain substring 'dan'");
    }
    // Iterate over the characters of the string, printing each one on a separate line
    System.out.println("--Printing all characters in myString");
    for (int i = 0; i < myString.length(); i++) {
      System.out.println(myString.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> myList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    myList.add("one");
    myList.add("two");
    myList.add("three");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println("All words in myList concatenated - " + myList.get(0) + ", ".concat(myList.get(1)) + ", ".concat(myList.get(2)));
    // Check whether two strings are equal
    if (myString.equals(myStringTwo)) {
      System.out.println("myString is equal to myStringTwo");
    }
    else {
      System.out.println("myString is not equal to myStringTwo");
    }
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
