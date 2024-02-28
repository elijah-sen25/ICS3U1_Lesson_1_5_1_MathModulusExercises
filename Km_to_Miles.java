
class Km_to_Miles extends ConsoleProgram {

  /**
  * Kilometer to Mile Conversion
  * @author: Elijah Sen
  */
  
  public void run() {
    // Establish Variables
    double dblKilometer;
    double dblMeter;

    // Gather input from user
    dblKilometer = readDouble("Enter a distance in Kilometers: ");

    // Calculate Conversion
    dblMeter = (dblKilometer * 0.621371);

    // Display Answer
    System.out.println(dblKilometer + " kilometers converts to " + dblMeter + " meters" );

    
  }
}
