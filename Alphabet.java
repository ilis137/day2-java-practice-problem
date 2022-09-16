package PracticeProblem;

import java.util.Scanner;

public class Alphabet {
  public void checkType(char alpha) {
    switch (alpha) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("The character is a vowel");
        break;
      default:
        System.out.println("The character is a consonant");
    }
  }

  public static void main(String[] args) {
    char alpha;
    System.out.println("Enter a letter");
    Scanner sc = new Scanner(System.in);
    alpha = sc.next().charAt(0);
    Alphabet obj = new Alphabet();
    obj.checkType(alpha);
  }

}
