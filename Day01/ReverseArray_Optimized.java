package Day01;

import java.util.Scanner;

public class ReverseArray_Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = N - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}
