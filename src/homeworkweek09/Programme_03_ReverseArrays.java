package homeworkweek09;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */

//Create Main Class
public class Programme_03_ReverseArrays {
    public static void main(String[] args) {
        reverseArray(); //call static method into main method
    }

    public static void reverseArray() {
        int a[] = {10, 20, 30, 40, 50, 60}; //declaring array
        System.out.println("Original Values are : " + Arrays.toString(a));
        //initialization start and end variable
        int start = 0;
        int end = a.length - 1;
        while (start < end)  //condition check for variable
        {
            //using temp variable swap the values of array
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse values are : " + Arrays.toString(a)); //reversed value will be displayed
    }

}
