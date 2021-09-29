package HomeWorkJava;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int[] arr1 = {1, 3, 5, 7, 9, 12};
        int[] arr2 = {2, 3, 7, 7, 8, 9, 10, 15, 21, 35};
        int[] arr = task3.oneArray(arr1, arr2);
        System.out.println("Об'єднаний масив: " + Arrays.toString(arr));

        int[] array = task3.sortArray(arr);
        System.out.println("Об'єднаний та відсортований масив: " + Arrays.toString(array));

    }

    public int[] oneArray(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
        return arr;

    }

    public int[] sortArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }
        return arr;
    }
}
