package es.santander.ascender;

public class SortArray {
    public static void sortArray(String[] args) {
        int [] number = {-1, 3, 6, 9};
        printArray(number);
        SortNumber(number);
        printArray(number);
    }

    public static void printArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.printl("");
    }    

    public static void SortNumber (int[] array) { 
        for (int i=0; i<array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j=1; j<array.length; j++) {
                if (array[j]<min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i!=min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }

}
