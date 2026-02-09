import java.util.Scanner;

public class EquilibriumIndex_Optimized {
    public static int findEquilibriumIndex(int[] arr, int N) {
        int totalSum = 0;

        for(int i = 0; i < N; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for(int i = 0; i < N; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int equilibriumIndex = findEquilibriumIndex(arr, N);

        System.out.println(equilibriumIndex);

        sc.close();
    }
}
