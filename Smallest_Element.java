// Find the smallest element in an array


// Solution1: Sorting

// Intuition: We can sort the array in ascending order, hence the smallest element will be at the 0th index. 

// Approach: 

// Sort the array in ascending order.
// Print the 0th index.


// Code:-->

public class Smallest_Element {



    //print the smallest element {0th index} of the array

    public static void PrintSmallestElement(int arr[], int n) {
        System.out.print("Smallest element of the array is: " + arr[0]);
    }



    // sort the array

    public static void SortedArray(int arr[], int k) {
        for(int i=0; i<k; i++)
        {
            for(int j=i+1; j<k; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        PrintSmallestElement(arr, k);
    }

    // main function of the code 

    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        int n = arr.length;
        SortedArray(arr, n);
    }
}



// Solution2: Using a min variable

// Intuition: We can maintain a min variable which will update whenever the current value is less than the value in the min variable.  

// Approach: 

// Create a min variable and initialize it with arr[0].
// Use a for loop and compare it with other elements of the array
// If any element is less than the min value, update min value with element’s value
// Print the min variable.


// code:-->


public class Smallest_Element {

    // Compare to min to the all the element of the array

    public static void FindMinimum(int arr[], int k, int min){
        for(int i=1; i<k; i++){
            if(min > arr[i]){
                int temp = arr[i];
                arr[i] = min;
                min = temp;
            }
        }
        // print the Smallest element of the array
        System.out.print("Smallest element of the array is: " + min);
    }

    public static void main(String[] args){
        int arr[] = {8,1,5,7,9};
        int n = arr.length;
        int min = arr[0];
        FindMinimum(arr, n, min);
    }
}