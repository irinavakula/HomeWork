package es.santander.ascender;

public class Maximum {
  public int calc(int[] numbers) {
    int maxNumber = numbers[0];
    for (int number : numbers) {
      if (number > maxNumber) {
        maxNumber = number;
      }
    }
    System.out.println("The maximum number in the array is: " + maxNumber);
    return maxNumber;
  }
}
