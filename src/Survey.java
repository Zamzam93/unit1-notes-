import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome. Thank you");

      int counter = 0;
      System.out.println("What is your name?");
      scan.nextLine();
      counter++;


      System.out.println("How much money do you spend on coffee?");
      double coffeePrice = scan.nextDouble();
      counter++;
    }

}
