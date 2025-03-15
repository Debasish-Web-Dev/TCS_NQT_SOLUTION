// Find the Largest element in an array


// Solution1: Sorting
// Intuition:
// We can sort the array in ascending order, hence the largest element will be at the last index of the array. 

// Approach: 
// Sort the array in Decending order.
// Print the (0)th index.

// code:-->

public class Largest_Element {


    public static void largest_Element(int arr[], int k){
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Largest element of the array is: " + arr[0]);
    }
    public static void main(String[] args){
        int arr[] = {8,10,25,7,39};
        int n = arr.length;
        largest_Element(arr, n);
    }
}


// Complexity Analysis

// Time Complexity: O(N*N)

// Space Complexity: O(n)



// Solution2: Sorting(using Arrays.sort())
// Intuition:
// We can sort the array in ascending order, hence the largest element will be at the last index of the array. 

// Approach: 
// Sort the array in Ascending order.
// Print the (size of the array -1)th index.


// code:-->

import java.util.Arrays;
public class Largest_Element {


    public static void largest_Element(int arr[], int k){
        Arrays.sort(arr);
        System.out.print("Largest element of the array is: " + arr[k-1]);
    }
    public static void main(String[] args){
        int arr[] = {8,10,25,7,39};
        int n = arr.length;
        largest_Element(arr, n);
    }
}


// Complexity Analysis

// Time Complexity: O(N*log(N))

// Space Complexity: O(n)




// Solution3: Using a max variable
// Intuition:
// We can maintain a max variable that will update whenever the current value is greater than the value in the max variable.  

// Approach: 
// Create a max variable and initialize it with arr[0].
// Use a for loop and compare it with other elements of the array
// If any element is greater than the max value, update max value with the element’s value


// code:-->


public class Largest_Element{

    public static void largest_Element(int arr[], int k, int max){
        for(int i=1;i<k;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print("Largest element of the array: " + max);
    }
    public static void main(String[] args){
        int arr[] = {8,100,25,7,39};
        int n = arr.length;
        int max = arr[0];
        largest_Element(arr, n, max);
    }
}


// Complexity Analysis

// Time Complexity: O(N)

// Space Complexity: O(1)