import java.util.Scanner;

class Fibonacci {
  static int fib(int n) {
    return n <= 1 ? n : fib(n-1) + fib(n-2);
  }

  static void fibIter(int n) {
    for (int a=0, b=1, i=0; i<n; i++, b=a+b, a=b-a)
      System.out.print(a + " ");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no of terms:");
    int n = sc.nextInt();
    
    System.out.println("Fibonacci Series using Non-Recursive Function:");
    fibIter(n);
    
    System.out.println("\n Fibonacci Series using Recursive Function:");
    for (int i=0; i<n; i++)
      System.out.print(fib(i) + " ");
  }
}
