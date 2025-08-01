// Approach:

// Convert the given string into lowercase for uniformity while counting vowels,consonants,whitespaces.
// This can be done by using towlower() and .toLowerCase() in C++ and Java respectively.
// Traverse the entire modified string by applying the following conditions:
// If any vowel then increment the vowel counter

// Else if any consonant then increment the consonant counter else if any whitespace then increment the whitespace counter



package TCS_String;

public class Count_V_C_S {

    public static void counting_vowels(String str) {
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels ++;
            }else if(ch>='a' && ch<='z'){
                consonants ++;
            }else{
                spaces ++;
            }
        }
        System.out.println("vowels : " + vowels);
        System.out.println("consonants : " + consonants);
        System.out.println("spaces : " + spaces);
    }

    public static void main(String[] args) {
        String str = "Hello This Is Debasish Das";
        str = str.toLowerCase();
        counting_vowels(str);
    }
}


// Time Complexity: O(n), n is the length of string

// Space Complexity: O(1)