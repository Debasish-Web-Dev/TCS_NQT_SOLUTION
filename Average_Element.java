public class Average_Element {

    public static double average_element(double arr[], int n) {
        double sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        double avg = sum/n;
        return avg;
    }

    public static void main(String[] args) {
        double arr[] = {1,2,1,1,5,1};
        int n = arr.length;
        double average =  average_element(arr, n);
        System.out.println("the average number of the array is : " + average);
    }

}


// Time Complexity: O(n) As we are traversing the array once.

// Space Complexity: O(1).