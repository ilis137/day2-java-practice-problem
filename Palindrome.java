package PracticeProblem;

import java.util.Scanner;

public class Palindrome {
  public void isPalindrome(int num) {
    int copy = num;
    int reverse = 0;
    while (copy > 0) {
      int rem = 0;
      rem = copy % 10;
      reverse = reverse * 10 + rem;
      copy /= 10;
    }
    if (reverse == num) {
      System.out.println(num + " is a palindrome");
    } else {
      System.out.println(num + " is not a palindrome");
    }
  }

  public static void main(String[] args) {
    int num;
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    Palindrome obj = new Palindrome();
    obj.isPalindrome(num);

  }
}
