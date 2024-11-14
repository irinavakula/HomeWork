public class exercise {
    public static void main(String[] args) {
        int [] array = new int[] {2, 7, 9, 1};

        int min = Integer.MAX_VALUE; 
        int min2 =Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];
            } else if (array[i] < min2 && array[i] !=min) {
                min2 = array[i];
            }

        }
        
        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Second min in the list: " + min2);
        } else {       
        System.out.println("Minimum quantity in thecart: " + min);
       }
    }
}