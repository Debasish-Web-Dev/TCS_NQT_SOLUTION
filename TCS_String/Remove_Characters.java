package TCS_String;

// public class Remove_Characters {

//     public static void main(String[] args) {
//         String str = "take12% *&u ^$#forward";
//         String s = "";
//         int n = str.length();
//         for(int i=0;i<n;i++){
//             if(Character.isLetterOrDigit(str.charAt(i))){
//                 s = s + str.charAt(i);
//             }
//         }
//         System.out.print(s.replaceAll("\\d", ""));
        
//     }
// }
public class Remove_Characters {


    public static void remove_string_characters(String str) {
        StringBuffer s = new StringBuffer();
        // String s = "";
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>64 && str.charAt(i)<=91) || (str.charAt(i)>96 && str.charAt(i)<=122)){
                // s = s + str.charAt(i);
                s.append(str.charAt(i));
            }
        }
        System.out.print(s);
    }
    public static void main(String[] args) {
        String str = "Take12% *&u ^$#forward";
        remove_string_characters(str);
        
    }
}