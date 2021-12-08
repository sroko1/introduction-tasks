package pl.sda.introductiontasks.tasks2;

/*
Create an array of length 10 and initialize with any integers.
Calculate sum of all numbers in this array and print it in the console.
 */

public class Task2_1 {
  public static void main(String[] args) {
    int[] array = {1, 54, 17, 23, -2, 18, 22, 98, 2, -5};
        // get stream of elements
        IntStream stream = IntStream.of(array);
        // add the elements in stream
        int sum = stream.sum();
        System.out.println("Sum of array elements is: " + sum);
    }
}
  
     
