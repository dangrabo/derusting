# Items to Refresh on:

As you work through this exercise, write down anything that you needed to look up or struggled to remember here. It can be just a word or two (e.g. "joining strings"). You can use this as a guide of what to make extra sure you're refreshed on before exams and interviews.


Lists
----------
ArrayList replace - myList.set(int index, E element)
Adding at index - myList.add(int index, E element)
Collections.sort(myList)


Arrays
----------
Creating an array {
    String[] myArray = new String[5]; // Where 5 is the length of the array
}


Strings
----------
Concatenation method - myString.concat(myStringTwo)


Maps
----------
For itteration {
    map.keySet() // To itterate keys
    map.values() // To itterate values
    map.entrySet() // To itterate both
}

entrySet() example {
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
    String key = entry.getKey();
    Integer value = entry.getValue();
    // do something with key and value
}
}


Classes and objects/instances
----------
Overriding the toString method:
@Override
public String toString() {
    return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

- 