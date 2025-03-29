

import java.util.HashSet;

public class Remove_Duplicates {

    public static void remove_duplicate(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,3};
        int n = arr.length;
        remove_duplicate(arr, n);
    }
}


// Solution 1: Brute Force
// Intuition: We have to think of a data structure that does not store duplicate elements. So can we use a Hash set? Yes! We can. As we know HashSet only stores unique elements.

// Approach: 

// Declare a HashSet.
// Run a for loop from starting to the end.
// Put every element of the array in the set.
// Store size of the set in a variable K.
// Now put all elements of the set in the array from the starting of the array.
// Return K.


import java.util.HashSet;

public class Remove_Duplicates {

    public static void remove_duplicate(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x : set){
            arr[j] = x;
            j++;
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,3};
        int n = arr.length;
        remove_duplicate(arr, n);
    }
}


// Time complexity: O(n*log(n))+O(n)

// Space Complexity: O(n) 




// Solution 2: Two pointers
// Intuition: We can think of using two pointers ‘i’ and ‘j’, we move ‘j’ till we don't get a number arr[j] which is different from arr[i]. As we got a unique number we will increase the i pointer and update its value by arr[j]. 

// Approach:
// Take a variable i as 0;
// Use a for loop by using a variable ‘j’ from 1 to length of the array.
// If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
//  After completion of the loop return i+1, i.e size of the array of unique elements.

// code -->

public class Remove_Duplicates {

    public static void remove_duplicate(int arr[], int n) {
        int i = 0;
        for(int j=0;j<n;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,3};
        int n = arr.length;
        remove_duplicate(arr, n);
    }
}


// Time Complexity: O(N)

// Space Complexity: O(1)