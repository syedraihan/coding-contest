// Codeforces Round #310 (Div. 2)
// A. Case of the Zeros and Ones
// http://codeforces.com/contest/556/problem/A

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        Stack<Integer> stack = new Stack<Integer>();

        for (int i=0; i<s.length; i++) {
            int digit = s[i] - '0';
            if (!stack.empty())  {
                int nextDigit = stack.peek() ^ digit;
                if (nextDigit == 1) {
                    stack.pop();
                } else {
                    stack.push(digit);
                }
            } else {
                stack.push(digit);
            }
        }

        System.out.println(stack.size());

        in.close();
    }
}