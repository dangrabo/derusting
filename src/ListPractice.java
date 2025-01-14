import java.util.*;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> myList = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    myList.add("one");
    myList.add("two");
    myList.add("three");
    // Print the element at index 1
    System.out.println(myList.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    myList.set(1, "newTwo");
    System.out.println(myList);
    // Insert a new element at index 0 (the length of the list will change)
    myList.add(0, "zero");
    System.out.println(myList);
    // Check whether the list contains a certain string
    if (myList.contains("zero")) {
      System.out.println("String 'zero' found");
    }
    else {
      System.out.println("String 'zero' not found");
    }
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    System.out.println("--Printing elements unsorted--");
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }
    // Sort the list using the Collections library
    Collections.sort(myList);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    System.out.println("--Printing elements sorted--");
    for (String word : myList) {
      System.out.println(word);
    }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}