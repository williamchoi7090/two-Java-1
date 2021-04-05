class Main {
  static char[] main;
  static int b = -1;

  static void push(char a) {
    main[++b] = a;
  }
  static char pop() {
    return main[b--];
  }
  static int isPalindrome(char c[]) {
    int length = c.length;
    main = new char[length * 4];
    int n, mid = length / 2;
    for (n = 0; n < mid; n++) {
      push(c[n]);
    }
    if (length % 2 != 0) {
      n++;
    }
    while (n < length) {
      char a = pop();
      if (a != c[n])
        return 0;
      n++;
    }
    return 1;
  }

  public static void main(String[] args) {
    char c[] = "wow".toCharArray();
    if (isPalindrome(c) == 1) {
      System.out.println("Yes, this word is a palindrome.");
    } else {
      System.out.println("No, this word is not a palindrome.");
    }
  }
}