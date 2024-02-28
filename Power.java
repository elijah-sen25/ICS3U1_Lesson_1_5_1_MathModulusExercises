class Power extends ConsoleProgram {

  /**
  * Print a,b as a^b
  * @author: Elijah Sen
  */
  
  public void run() {
    // Establish Variables
    double dblValueA;
    double dblValueB;
    double dblProduct;

    // Gather User Inputs
    dblValueA = readInt("Enter a value for A: ");
    dblValueB = readInt("Enter a value for B: ");

    // Calculate
    dblProduct = Math.pow(dblValueA, dblValueB);

    // Display Answer
    System.out.println(dblValueA + " to the power of " + dblValueB + " equals " + dblProduct);
  }
}