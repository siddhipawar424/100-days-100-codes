package Day04;

import java.util.Scanner;

public class RemoveDuplicates_Optimized {
    public static int removeDuplicates(int[] arr, int n) {
        if(n == 0) return 0;

        int p1 = 0, p2 = 1;

        while(p2 < n) {
            if(arr[p1] == arr[p2]) {
                p2++;
            }
            else {
                p1++;
                arr[p1] = arr[p2];
            }
        }

        return p1 + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int countAfterRemovingDuplicates = removeDuplicates(arr, N);

        for(int i = 0; i < countAfterRemovingDuplicates; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
