class Rads extends ConsoleProgram {

  /**
  * Convert Degree Measures to Radians
  * @author: Elijah Sen
  */
  
  public void run() {
    // Establish Variables
    double dblDegrees;
    double dblRadians;
    
    // Gather User Input
    dblDegrees = readDouble("Enter a degree measure: ");

    // Complete Calculation
    dblRadians = Math.toRadians(dblDegrees);

    // Display Response
    System.out.println("This equates to " + dblRadians + " radians.");
    
  }
}