package es.santander.ascender;

import java.util.Random;

public class ArrayMin {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rnd = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
            System.out.println(array[i] + " ");
        }


        int secondMin = array[0];
        for(int i = 0; i < array.length; i++) {
            if(secondMin > array[i]) {
              secondMin = array[i];
            }
        }
        System.out.println("Second Min is: " + secondMin);
        }

        
    }

