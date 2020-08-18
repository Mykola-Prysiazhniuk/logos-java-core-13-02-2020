package home.work.hm11;

import java.util.Arrays;
import java.util.Collections;

public class Array1 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 4, 25, 34, 16, 3, 87};
        Arrays.sort(array1);
        System.out.println("array1 after sort: " + Arrays.toString(array1));
        Arrays.sort(array1, Collections.reverseOrder());
        System.out.println("Array1 after reverse sort: " + Arrays.toString(array1));


    }
}
