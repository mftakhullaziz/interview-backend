package backend_interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinarySearchTest {
    public int BinarySearch(int[] array_n, int target) {

        int left = 0;
        int right = array_n.length-1;

        // sort array
        Arrays.sort(array_n);

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array_n[mid] == target) {
                return mid;
            } else if (array_n[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    @Test
    void binarySearchTest() {
        // System.out.println(BinarySearch(new int[] {1,2,4,22,55,77,91,80}, 91));
        int target_actual = 7;
        Assertions.assertEquals(BinarySearch(new int[] {1,2,4,22,55,77,91,80}, 91), target_actual);
    }

}
