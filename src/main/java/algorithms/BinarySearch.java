package algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinarySearch {
    public static void main(String[] args) {


        int[] arr = {1, 7, 55, 89, 20, 100, 30000};
        System.out.println(Arrays.stream(arr).mapToObj(v -> String.valueOf(v)).collect(Collectors.joining(", ")));
        Arrays.sort(arr);
        System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
        int index = binary(0, arr.length - 1, 55, arr);
        System.out.println("Found number:" + arr[index] + " at index " + index);    }


    private static int binary(int l, int r, int x, int[] arr) {
        if (r >= 1) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binary(l, mid - 1, x, arr);
            return binary(mid + 1, r, x, arr);
        }
        return -1;
    }
}
