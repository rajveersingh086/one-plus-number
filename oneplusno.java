package leetcode;

import java.util.*;

class Solution {
    static int[] oneplusno(int digits[]) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits:");
        int n = sc.nextInt();
        int[] digits = new int[n];

        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        int[] result = oneplusno(digits);

        System.out.print("Result after adding one: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
