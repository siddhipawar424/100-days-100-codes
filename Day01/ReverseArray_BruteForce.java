package Day01;

import java.util.Scanner;

public class ReverseArray_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] rev = new int[N];

        int j = 0;
        for(int i = N - 1; i >= 0; i--) {
            rev[j++] = arr[i];
        }

        for(int n : rev) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}
