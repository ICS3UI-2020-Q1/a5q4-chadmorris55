import java.util.Scanner;
/**
 * adds all of the numbers before the given number together
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    //asks user for number
    System.out.println("Please enter a starting balance");
    double balance = input.nextDouble();
    //asks for interest rate
    System.out.println("Please enter your interest rate");
    double interest = input.nextDouble();
    //asks for years invested for
    System.out.println("Please enter the number of years you will invest for");
    double years = input.nextDouble();
    //balance is equal to itself plus itself * interest rate and this repeats until the count reaches the amount of years, then prints the final balance
    for (int count = 1; count <= years; count++){
      balance = balance + balance*(interest/100);
      
    }System.out.println("Your final balance will be $" + balance);
  }
}
