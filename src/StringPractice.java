import java.util.ArrayList;
import java.util.Arrays;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "Connor";
    System.out.println(word + "\n");
    // Find the length of the string
    System.out.println(word.length() + "\n");
    // Concatenate (add) two strings together and reassign the result
    String fName = "Connor";
    String lName = "Hughes";
    String fullName = fName + " " + lName;
    System.out.println(fullName + "\n");
    // Find the value of the character at index 3
    System.out.println(word.charAt(3) + "\n");

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(word.contains("a") + "\n");

    // Iterate over the characters of the string, printing each one on a separate line
    for(int i =0; i < word.length(); i++){
      System.out.println(word.charAt(i));
    }
    System.out.println("\n");
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> ray = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    ray.add("car");
    ray.add("dog");
    ray.add("cat");
    ray.add("red");
    ray.add("blue");
    System.out.println(ray + "\n");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String concat = String.join(", ", ray);
    System.out.println(concat + "\n");

    // Check whether two strings are equal
    String one = "racecar";
    String two = "Truck";
    System.out.println(one.equals(two));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
