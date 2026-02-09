package Day03;

import java.util.Scanner;
import java.util.Arrays;

public class SecondSmallest_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int firstSmallest = arr[0], secondSmallest = arr[0];

        for(int i = 1; i < N; i++) {
            if(arr[i] != firstSmallest) {
                secondSmallest = arr[i];
                break;
            }
        }

        System.out.println("Second smallest element: " + secondSmallest);

        sc.close();
    }
}
