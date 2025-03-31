// Solution 1: Using for loop                                                                                                                                             

// Approach: 

// Using for loop traverse through the array and while traversing  maintain  a variable for storing sum of the elements in the array.
// After completing the traversal simply print the sum.

// code -->


public class Sum_Of_Array {
    public static int sum_array(int arr[], int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int a = sum_array(arr, n);
        System.out.println("sum of the array is : " + a);
    }
}

// Time Complexity: O(n) As we traverse the array once.

// Space Complexity: O(1).



// Solution 2: Using collection in Java

// Approach:

// For C++: “accumulate” is used to calculate the sum of all the elements in the array.    

// For Java: Instream sum() gives the sum of all the elements in the stream.

// code -->

import java.util.Arrays;

public class Sum_Of_Array {


    public static int sum_array(int arr[], int n) {
        int sum = Arrays.stream(arr).sum();
        return sum;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int a = sum_array(arr, n);
        System.out.println("sum of the array is : " + a);
    }
}

// Time Complexity: O(n).

// Space Complexity: O(1).