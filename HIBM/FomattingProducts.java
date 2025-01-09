import java.util.*;
public class FomattingProducts {
  public static String formatProducts(int a, int b) {
    int result = 1;
    for (int i = a; i <= b; i++)
      result = result * i;
    int temp = result;
    int power = 0;
    while ((result % 10) == 0) {
      power = power + 1;
      result = result / 10;
    }
    return result + " * 10^" + power;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(formatProducts(a, b));
  }
}