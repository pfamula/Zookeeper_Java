import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // start coding here
    int number = 0;
    int newNumber;
    do {
      newNumber = scanner.nextInt();
      if (number < newNumber) {
        number = newNumber;
      }
    } while (newNumber != 0);
    System.out.println(number);
  }
}
