// Solution 1: Recursive method

// Approach: The recursive method has an approach almost similar to the iterative one. The approach has been broken down into some steps for simplicity.

// Create a function that takes an array, start index, and end index of the array as parameters.
// Swap the elements present  at the start and end index, 
// The portion of the array left to be reversed is arr[left+1,right-1]. Make a recursive call to reverse the rest of the array. While calling recursion pass left +1  and right - 1 as parameters for the shrunk array. Repeat step 2.
// Continue recursion as long as the ‘start < end’ condition is satisfied. This is the base case for our recursion.


// code-->

public class Reverse_Array {

    public static void print_array(int arr[]) {
        System.out.print("After reverse the array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse_array(int arr[], int left, int right) {
        if(left < right){
            int temp = arr[left];
            arr[left] = arr[right] ;
            arr[right] = temp;
            reverse_array(arr, left+1, right-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int left = 0;
        int right = n-1;
        System.out.print("Before reverse the array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverse_array(arr, left, right);
        print_array(arr);
    }
}

// Time Complexity: O(n)

// Space Complexity: O(1)




// Solution 2: Space-optimized iterative method

// Approach: Unlike the previous method we use the same array to obtain the result. Follow the steps below.

// Keep a pointer p1(left)  at the first index and another p2(right) at the last index of the array. 
// Swap the elements pointed by p1 and p2, Post swapping increment p1 and decrement p2.
// This process is repeated for only the first n/2 elements where n is the length of array.
// Note: Swapping all the n elements instead of n/2 elements leaves the array unaltered.

// code-->


public class Reverse_Array {

    public static void reverse_array(int arr[], int n) {
        System.out.print("Before reverse the array is : "); 
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print("After reverse the array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        reverse_array(arr, n);
    }
}


// Time Complexity: O(n), single-pass involved.

// Space Complexity: O(1) 