// Approach:

// Run a for loop till half the length of the string in order to check the first and last character of the string.

// And check if the first and last elements of the string are equal. And then move both pointers first pointer forward and last pointer backward.

// Here we are achieving this with the help of ‘i’ which moves with them for a loop. First element can be get by str[i] and last element by str[str.length() - i - 1]). If this condition gets executed then it is not palindrome and returns false.

// If the loop ends after traversing elements till half of the length then, it is Palindrome and returns false.



package TCS_String;

// public class Palindrome {

//     public static boolean palindrome(String str) {
//         int left = 0;
//         int right = str.length()-1;
//         while (left < right) {
//             char l = str.charAt(left);
//             char r = str.charAt(right);
//             if(!Character.isLetterOrDigit(l)){
//                 left ++;
//             }else if(!Character.isLetterOrDigit(r)){
//                 right --;
//             }else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
//                 return false;
//             }else{
//                 left ++;
//                 right --;
//             }
//         }
//         return true;
//     }



//     public static void main(String[] args) {
//         String str = "ABCA";
//         boolean hello =  palindrome(str);
//         if(hello){
//             System.out.println("It is palindrome");
//         }else{
//             System.out.println("It is not a palindrome");
//         }
//     }
// }



// Time Complexity:  O(N)

// Space Complexity: O(1)




public class Palindrome {

    public static boolean palindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if(l == r){
                left ++;
                right --;
            }else{
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "1221";
        boolean hello = palindrome(str);
        if(hello){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}