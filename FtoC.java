class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author: Elijah Sen
  */
  
  public void run() {
    // Establish Variables
    double dblCelsius;
    double dblFarenheit;
    
    // Gather User Prompt
    dblFarenheit = readDouble("Enter Farenheit Temperature: ");

    // Calculate Celsius
    dblCelsius = (5.0/9.0) * (dblFarenheit - 32);

    // Display Answer
    System.out.println("The temperature is " + dblCelsius + " degrees celsius.");
  }
}