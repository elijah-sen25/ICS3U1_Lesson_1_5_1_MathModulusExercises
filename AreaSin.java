class AreaSin extends ConsoleProgram {

  /**
  * @author:Elijah Sen
  */
  
  public void run() {
    // Declare Variables
      double dblSideA;
      double dblSideB;
      double dblAngleC;
      double dblSideC;

    // Gather User Input

      dblSideA = readDouble("Enter a value for A: ");
      dblSideB = readDouble("Enter a value for B: ");
      dblAngleC = readDouble("Enter a value for the given angle: ");


    // Calculate Cosine Law

      dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(dblAngleC));

    // Display Answer

      System.out.println("The Value of Side C is " + dblSideC);
      
    
  
  }
}