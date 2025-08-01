// Approach: 

// Basically, we store the character value in an integer which gives us the ASCII value of the character.
// When we put character value inside an integer the typecasting occurs which converts character value into integer which is ASCII value. 
// And then we print the ASCII value.

package TCS_String;

public class Ascii_Value {
    public static void main(String[] args) {
        char c = 'e';
        int ascii = c;
        System.out.println(ascii);
    }
}

// Time Complexity: O(1)

// Space Complexity: O(1)
