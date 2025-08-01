// Approach: 

// Iterating through all the characters and finding if there is whitespace and if found skipping it and adding the next element to our string using a count variable.

// The approach follows the following steps.

// Take a count variable that tells us the spaces seen sor far.
// Using a for loop, iterate through all the characters and check this condition.
// If the character at the current index is a whitespace or not, if not present then add the character to our string.
// Then increment the count to trace the whitespaces seen so far.
//  Now after traversing all the characters and removing all the whitespaces we have our string without whitespace.



package TCS_String;

public class Remove_Spaces {
    public static void main(String[] args) {
        String str = "My name is Debasish Das";
        char ch[] = str.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] != ' '){
                ch[count] = ch[i];
                count ++;
            }
        }
        System.out.println(String.valueOf(ch).subSequence(0, count));

    }
}



// Time Complexity: O(N)

// Space Complexity: O(1)