import java.util.Arrays;

public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] ray = {"one", "two", "three", "four"};
    System.out.println(Arrays.toString(ray) + '\n');

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    ray[0]= "1";
    ray[1]= "2"; 
    ray[2]= "3";
    ray[3]= "4";
    System.out.println(Arrays.toString(ray) + "\n");
    // Get the value of the array at index 2
    System.out.println(ray[2] + "\n");

    // Get the length of the array
    System.out.println(ray.length + "\n");
    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < ray.length; i++){
        System.out.println(ray[i]);
    }
    System.out.println("\n");
    // Iterate over the array using a for-each loop and print out each item
    for (String item: ray){
      System.out.println(item);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
