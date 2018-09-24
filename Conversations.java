import java.util.Scanner;
public class Conversations{

public static void main(String[] args) {
  System.out.println("Hello! We are going to create a short story.");
  Scanner input =  new Scanner(System.in);
  System.out.print("Please enter your name: ");
  String username = input.nextLine();
  Scanner input =  new Scanner(System.in);
  System.out.print("Please enter a noun: ");
  String noun = input.nextLine();
  Scanner input =  new Scanner(System.in);
  System.out.print("Please enter a verb: ");
  String verb = input.nextLine();
  Scanner input =  new Scanner(System.in);
  System.out.print("Please enter an interger: ");
  int interger = input.nextLine();
  Scanner input =  new Scanner(System.in);
  System.out.print("Please enter a real (decimal) number: ");
  double decimal = input.nextLine();

  String story = "One day, " + username + " picked up a " + noun;
  story += " and decided to " + verb + " it.\n";
  story += "After getting arrested, spending " + interger;
  story += " days in jail, and paying a $" + decimal + " fine,\n";
  story += name + " decided that was a bad idea!";


}
}
