class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author: Elijah Sen
  */
  
  public void run() {
    // Declare Variables
    double dblRadius;
    double dblCircumference;

   // Gather Prompt
    dblRadius = readDouble("Enter a radius: ");

    // Calculate Circumference using prompt
    dblCircumference = 2 * Math.PI * dblRadius;

    // Display Answer

    System.out.println("The Circumference is: " + dblCircumference);


    
  }
}