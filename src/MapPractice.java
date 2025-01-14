import java.util.*;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
     Map<String, Integer> myMap = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    myMap.put("one", 1);
    myMap.put("two", 2);
    myMap.put("three", 3);
    System.out.println(myMap);
    // Get the value associated with a given key in the Map
    System.out.println("The value for key 'one' is - " + myMap.get("one"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println("The size of myMap is - " + myMap.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    myMap.put("three", 33);
    System.out.println("New myMap values are - " + myMap);
    // Check whether the Map contains a given key
    if (myMap.containsKey("one")) {
      System.out.println("myMap does contain the key 'one'");
    }
    else {
      System.out.println("myMap does not contain the key 'one'");
    }
    // Check whether the Map contains a given value
    if (myMap.containsValue(1)) {
      System.out.println("myMap does contain the value 'one'");
    }
    else {
      System.out.println("myMap does not contain the key 'one'");
    }
    // Iterate over the keys of the Map, printing each key
    System.out.println("--Printing all keys in myMap--");
    for (String key : myMap.keySet()) {
      System.out.println(key);
    }
    // Iterate over the values of the map, printing each value
    System.out.println("--Printing all values in myMap--");
    for (int key : myMap.values()) {
      System.out.println(key);
    }
    // Iterate over the entries in the map, printing each key and value
    System.out.println("--Printing all key/value pairs in myMap--");
    for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
