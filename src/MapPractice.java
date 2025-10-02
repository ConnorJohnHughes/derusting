import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    HashMap<String, Integer> map = new HashMap<>();


    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    map.put("Tacos", 5);
    map.put("Burgers", 8);
    map.put("Cheesecake", 10);
    System.out.println(map + "\n");

    // Get the value associated with a given key in the Map
    System.out.println(map.get("Tacos") + '\n');

    // Find the size (number of key/value pairs) of the Map
    System.out.println(map.size() + "\n");

    // Replace the value associated with a given key (the size of the Map shoukld not change)
     map.replace("Tacos", 5, 7);
    System.out.println(map + "\n");

    // Check whether the Map contains a given key
    System.out.println(map.containsKey("Tacos") + "\n");

    // Check whether the Map contains a given value
     System.out.println(map.containsValue(9) + "\n");

    // Iterate over the keys of the Map, printing each key
    for(String key : map.keySet()){
      System.out.println(key);
    }
    System.out.println("\n");
    // Iterate over the values of the map, printing each value
    for(int value : map.values()){
      System.out.println(value);
    }
    System.out.println("\n");

    // Iterate over the entries in the map, printing each key and value
    map.forEach((key, value) -> {System.out.println(key + ", " + value);});

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
