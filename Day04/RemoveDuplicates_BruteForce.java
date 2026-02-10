package Day04;

import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < N; i++) {
            set.add(arr[i]);
        }

        int index = 0;

        for(int num : set) {
            arr[index] = num;
            index++;
        }

        for(int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
