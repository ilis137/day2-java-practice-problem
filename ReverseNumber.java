package PracticeProblem;

import java.util.Scanner;

public class ReverseNumber {

  public int reverseNumber(int num) {
    int reverse = 0;
    while (num > 0) {
      int rem = 0;
      rem = num % 10;
      reverse = reverse * 10 + rem;
      num /= 10;
    }
    return reverse;
  }

  public static void main(String[] args) {
    int num;
    System.out.println("Enter a  to reverse");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    ReverseNumber obj = new ReverseNumber();
    int reverse = obj.reverseNumber(num);
    System.out.println("the reverse number is: " + reverse);

  }
}
