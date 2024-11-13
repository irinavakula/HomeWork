package es.santander.ascender;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7, 8, 9};

        System.out.println("Arr1 : " + Arrays.toString(arr1));
        System.out.println("Arr2 : " + Arrays.toString(arr2));

        HashSet set = new HashSet<>();
    

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    set.add(arr1[i]);
                }
            }

        }

        System.out.println("Common element : " + (set));


    }

}
