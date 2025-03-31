// Solution :-
// Intuition : 
// The problem requires us to simply implement the mathematical formula programmatically. Hence, we need to make sure that the array is sorted and calculate the answer based on whether n is odd or even.

// Approach : 
// Sort the array in ascending order
// Check whether n is odd or even
// Calculate the median accordingly. Here’s a quick demonstration of the same

// code -->

import java.util.Arrays;

public class Medium_Element {
    public static void median_number(int arr[], int n) {
        Arrays.sort(arr);
        if(n%2==0){
            int idx1 = (n/2)-1;
            int idx2 = (n/2);
            double mid = (double) (arr[idx1] + arr[idx2])/2;
            System.out.println("the medium element of the array is : " + mid);
        }else{
            System.out.println("the medium element of the array is : " + arr[n/2]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        median_number(arr, n);
    }
}


// Time Complexity: O(N*log N), Sorting of array

// Space Complexity: O(1)