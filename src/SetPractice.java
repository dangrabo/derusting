import java.util.*;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> mySet = new HashSet<>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    mySet.add("one");
    mySet.add("two");
    mySet.add("three");
    System.out.println(mySet);
    // Check whether the Set contains a given String
    if (mySet.contains("one")) {
      System.out.println("mySet does contain string 'one'");
    }
    else {
      System.out.println("mySet does not contain string 'one'");
    }
    // Remove an element from the Set
    mySet.remove("three");
    System.out.println(mySet);
    // Get the size of the Set
    System.out.println("The size of the set is - " + mySet.size());
    // Iterate over the elements of the Set, printing each one on a separate line
    System.out.println("--Printing all elements in mySet--");
    for (String word : mySet) {
      System.out.println(word);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
