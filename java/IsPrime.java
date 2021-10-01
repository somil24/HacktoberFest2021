import java.util.*;

class IsPrime {
  public static void main(String[] args) {
    int a[] = { 1, 4, 5, 2, 6, 345, 435 };
    for (int i : a)
      System.out.println((isprime(i)));

  }

  public static boolean isprime(int number) {
    int cont = 2;
    boolean prime = true;
    while ((prime) && (cont != number)) {
      if (number % cont == 0)
        prime = false;
      cont++;
    }
    return prime;
  }
}