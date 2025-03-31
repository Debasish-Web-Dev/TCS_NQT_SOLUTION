// Solution 1: (Brute Force) [this approach only works if there are no duplicates]
// Intuition:
// What do we do to find the largest or the smallest element present in an array? We ideally sort them and the first element would be the smallest of all while the last element would be the largest. Can we find the second-smallest and second-largest using a similar approach?

// Approach:
// Sort the array in ascending order
// The element present at the second index is the second smallest element
// The element present at the second index from the end is the second largest element

// code -->

import java.util.Arrays;

public class Second_Smallest_and_Largest {
    public static void second_largest(int arr[], int k) {
        System.out.print("second largest element of the array: " + arr[k - 2]);
    }

    public static void second_smallest(int arr[], int k) {
        System.out.print("\nsecond smallest element of the array: " + arr[1]);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int n = arr.length;
        if (n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        second_largest(arr, n);
        second_smallest(arr, n);
    }
}


// Time Complexity: O(NlogN), For sorting the array

// Space Complexity: O(1)




// Solution 2(Best Solution)
// Intuition:
// In the previous solution, even though we were able to bring down the time complexity to O(N), we still needed to do two traversals to find our answer. Can we do this in a single traversal by using smart comparisons on the go?

// Approach:
// We would require four variables: small,second_small, large, and second_large. Variable small and second_small are initialized to INT_MAX while large and second_large are initialized to INT_MIN.

// Second Smallest Algo:

// If the current element is smaller than ‘small’, then we update second_small and small variables
// Else if the current element is smaller than ‘second_small’ then we update the variable ‘second_small’
// Once we traverse the entire array, we would find the second smallest element in the variable second_small.
// Here’s a quick demonstration of the same.
// Second Largest Algo:

// If the current element is larger than ‘large’ then update second_large and large variables
// Else if the current element is larger than ‘second_large’ then we update the variable second_large.
// Once we traverse the entire array, we would find the second largest element in the variable second_large.
// Here’s a quick demonstration of the same.


public class Second_Smallest_and_Largest {

    public static void second_smallest(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min > arr[i]){
                smin = min;
                min = arr[i];
            }else if(smin > arr[i] && smin != min){
                smin = arr[i];
            }
        }
        System.out.println("second smallest element of the array: " + smin);
    }

    public static void Second_Largest(int arr[], int n) {
        int max = -1;
        int smax = -1;
        for(int i=0;i<n;i++){
            if(max < arr[i]){
                smax = max;
                max = arr[i];
            }else if(smax < arr[i] && smax!=max){
                smax = arr[i];
            }
        }
        System.out.print("second largest element of the array: " +  smax);
    }
    public static void main(String[] args) {
        int arr[] = { 10, 2, 4, 7, 7, 5};
        int n = arr.length;
        second_smallest(arr, n);
        Second_Largest(arr, n);
    }
}

// Time Complexity: O(N), Single-pass solution

// Space Complexity: O(1)