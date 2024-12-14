package davaleba3;

public class Work3 {
    public static void main(String[] args) {
        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int l = 0; l < arr.length - 1 - i; l++) {
                if (arr[l] > arr[l + 1]) {
                    int temp = arr[l];
                    arr[l] = arr[l + 1];
                    arr[l + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
