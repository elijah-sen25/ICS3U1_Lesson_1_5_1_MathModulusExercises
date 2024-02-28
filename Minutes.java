class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author: Elijah Sen
  */
  
  public void run() {
    //Declare Variables
    int intMinutes;
    int intHours;
    int intDays;
    
    int intRemainingMinutes;

    //Gather Input from user
    intMinutes = readInt("Enter a number of minutes: ");

    //Calculate Days, Hours, and Remaining Minutes using prompt
  
    intDays = intMinutes/1440;
    intRemainingMinutes = intMinutes % 1440;

    intHours  = intRemainingMinutes/60;
    intRemainingMinutes = intRemainingMinutes % 60;

    //Generate Response
    System.out.println("This equates to: " + intDays + " days, " + intHours + " hours and " + intRemainingMinutes + " minutes.");

    
  }
}