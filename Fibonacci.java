public class Fibonacci {

  public static void main(String args[]) {
      System.out.println(fib(4));
  }

  public static int fib(int n) {
    int a = 1;
    int b = 1;
    int c = 0;
    if (n == 1 || n == 2) {
      return a;
    }
    for (int i = 3; i <= n; i++) {
      c = a + b;
      a = b;
      b = c;
    }
    return c;
  }
}
