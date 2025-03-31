//solution: 01
// Approach:
// Given an array
// We will traverse the whole array and see if the element is present in the array or not
// If found we will print the index of the element
// Otherwise, we will print -1.



public class Linear_Serch {
    public static int linear_search(int arr[], int n, int k) {
        for(int i=0;i<n;i++){
            if(arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 3;
        int a = linear_search(arr, n, k);
        System.out.println("the element present in the index : " + a);
    }
}


// Time Complexity: O(N)

// Space Complexity: O(1)


// solution:02


// code -->

public class Linear_Serch {

    public static int linear_search(int arr[], int n, int k) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left + right)/2;
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] > k){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k = 5;
        int a = linear_search(arr, n, k);
        System.out.println("the element present in the index : " + a);
    }
}



// Time Complexity: O(log(N))

// Space Complexity: O(1)