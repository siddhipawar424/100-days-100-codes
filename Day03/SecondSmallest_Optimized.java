package Day03;

import java.util.Scanner;

public class SecondSmallest_Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            if(arr[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }
            else if(arr[i] > firstSmallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if(secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest element does not exist");
        }
        else {
            System.out.println("Second smallest element: " + secondSmallest);
        }

        sc.close();
    }
}
