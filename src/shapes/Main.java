package shapes;
import java.io.*;

// TODO: Provide at least one constructor
// TODO: Provide the implementation for toString method
// TODO: Provide setters and getters for each class
// TODO: Provide an is-a relationship

/* TODO
*   1. Make sure only one array contains all the values from shapes.txt
*   2. Ignore the line if the number of values is not correct for the particular shape
*   3. if the number of values is correct in order to build the shape but the actual values are negative or 0
*     Then throw an error (might want to create a separate Exception class
* */

/* TODO
*   1. Read the shapes.txt file
*     - Print the number of shapes created
*     - Print the shapes and their calculated perimeters polymorphically
*   2. Delete
*     - the triangle with the minimum perimeter (there might be many minimums)
*     - the circle with the maximum perimeter (there could be more than one maximum)
*     - print all the shapes and their perimeters polymorphically (using custom toString method)
*   3. Calculate and print (round to 2 decimal places)
*     - The total perimeter of all parallelograms
*     - The total perimeter of all triangles
* */

public class Main {
  public static void main(String[] args) {
    int currentTask = 1;
    printTitle();
    printCurrentTask(currentTask);

    // Read the lines of shapes.txt
    extractData("src/shapes/shapes.txt");
  }

  // Prints the title of the program
  private static void printTitle() {
    System.out.println("---- JAC444 Workshop 3 ----");
  }

  // Shows the current task
  private static void printCurrentTask(int currentTask) {
    System.out.println("---- Task " + currentTask + " ----");
  }

  // Reads the file's lines
  private static void extractData(String fileName) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] tokens = line.split(",");

        // Ignore the line if not values being passed@
        int tokensLength = tokens.length;
        if (tokensLength == 1) continue;

        String shapeName = String.valueOf(tokens[0]);
        float x = Float.parseFloat(String.valueOf(tokens[1]));

        System.out.println(String.valueOf(tokens[2]));
      }
    } catch (IOException e) { System.out.println(e.getMessage()); }
  }
}
