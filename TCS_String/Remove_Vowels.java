// Approach:  Go through every character of the string, and if a vowel is found then replace it with a removed vowel string.

package TCS_String;

public class Remove_Vowels {

    public static String remove_vowels(String str) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                str = str.substring(0, i) + str.substring(i+1);
                i--;
            }
        }
        return str;
    }


    public static void main(String[] args) {
        String str = "Hello This Is Debasish Das";
        str = str.toLowerCase();
        String sc =  remove_vowels(str);
        System.out.println("without vowels the string is : " + sc);
    }
}


// Time Complexity: O(n) since the total number of iterations required is the number of characters in a string

// Space Complexity: O(1)
