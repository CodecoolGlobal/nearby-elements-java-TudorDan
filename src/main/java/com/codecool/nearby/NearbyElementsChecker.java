package main.java.com.codecool.nearby;

import java.util.Arrays;

public class NearbyElementsChecker {
    public static void main(String[] args) {

        String array1 = Arrays.toString(GetNearbyElements.nearby(0, 2, 2));
        System.out.println(array1);

        String array2 = Arrays.toString(GetNearbyElements.nearby(1, 0, 1));
        System.out.println(array2);

        String array3 = Arrays.toString(GetNearbyElements.nearby(1, 3, 5));
        System.out.println(array3);
    }
}
