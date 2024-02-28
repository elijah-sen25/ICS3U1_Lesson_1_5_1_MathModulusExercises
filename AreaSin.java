class AreaSin extends ConsoleProgram {

  /**
  * @author:Elijah Sen
  */
  
  public void run() {
   
    // Establish Variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    // Gather User Prompts
    dblSideA = readDouble("Enter the length of Side A: ");
    dblSideB = readDouble("Enter the length of Side B: ");
    dblAngleC = readDouble("Enter the degree of Angle C: ");

    // Calculate the Area
    
    dblArea = (dblSideA * dblSideB * Math.sin(dblAngleC)) / 2;

    // Display Answer

    System.out.println("The area of the triangle is " + dblArea);

  
  }
}