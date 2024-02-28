class Hours extends ConsoleProgram {

  /**
  * Description
  * @author: Elijah Sen
  */
  
  public void run() {
     //Declare Variables
      int intHours;
      int intDays;
      int intHoursLeft;

      //Gather Input from User
      intHours = readInt("Enter a Number of Hours: ");
    
      //Calculate Days and remaining hours using input
      intDays = intHours / 24;
      intHoursLeft = intHours % 24;

      //Print Response
      System.out.println("This Equates to: " + intDays + " days and " + intHoursLeft + " hours." );
  }
}