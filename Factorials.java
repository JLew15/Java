import java.util.Scanner;

public class Factorials {
  public static void main(String[] args) {
    Scanner input =  new Scanner(System.in);
    int userNum = 0;
    System.out.print("Input a number: ");

    if (input.hasNextInt() ==  false) {
      System.out.println("Please try again!");
      input.close();
      return;
    }

    userNum = input.nextInt();

    long factorial = 1;

    for(long i = 1; i <= userNum; i++){
      factorial = factorial * i;
    }

    long index = 1;

    while (index <= userNum) {
      factorial = factorial * index;
      index++;
    }
    System.out.println("While loop results: " + factorial);
    System.out.println("For loop results: " + index);
    factorial = 1;
    index = 1;
    do {
      factorial = factorial * index;
      index++;
    } while (index <= userNum);

    System.out.println("Do While loop results: " + factorial);
    input.close();
  }

}
