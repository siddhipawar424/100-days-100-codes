import java.util.Scanner;

public class EquilibriumIndex_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int leftSum = 0, rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i + 1; j < N; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                sc.close();
                return;
            }
        }

        System.out.println(-1); 
        sc.close();
    }
}
