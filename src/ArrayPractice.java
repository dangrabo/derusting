public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] myArray = new String[3];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    myArray[0] = "one";
    myArray[1] = "two";
    myArray[2] = "three";
    // Get the value of the array at index 2
    System.out.println("Value at index 2 - " + myArray[2]);
    // Get the length of the array
    System.out.println("Length of myArray - " + myArray.length);
    // Iterate over the array using a traditional for loop and print out each item
    System.out.println("--Printing values in myArray (for loop)--");
    for (int i = 0; i < myArray.length; i++) {
      System.out.println(myArray[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    System.out.println("--Printing values in myArray (for each loop)--");
    for (String word : myArray) {
      System.out.println(word);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
