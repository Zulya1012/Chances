import java.util.Scanner;
public class shans2 {
  public static void main(String[] arg) {
    int x = 10;
    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 3; i++) {

      System.out.println("Enter the number:");
      int a = sc.nextInt();

      int b = a - x;

      if (b > 30) {
        System.out.println("Cold");
      } else if (b == 0) {
        System.out.println("Tuned");
        break;
      } else if (b < 30) {
        System.out.println("Warmer");
      }

    }
  }

}
