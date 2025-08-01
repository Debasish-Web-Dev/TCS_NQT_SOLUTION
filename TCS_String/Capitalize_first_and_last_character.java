
package TCS_String;

public class Capitalize_first_and_last_character {
    public static void uppercase_first_and_last_char(String str){
        StringBuffer sBuilder = new StringBuffer(str);
        int n = str.length();
        for(int i=0;i<n;i++){
            if(i == 0 || i == n-1 && (int) str.charAt(i) >= 97){
                sBuilder.setCharAt(i, (char)((int) str.charAt(i)-32));
            }else if(str.charAt(i) == ' '){
                if((int) str.charAt(i-1) >= 97 && (int) str.charAt(i - 1) <= 122){
                    sBuilder.setCharAt(i-1, (char)((int)str.charAt(i-1)-32));
                }
                if((int) str.charAt(i + 1) >= 97 && (int) str.charAt(i + 1) <= 122){
                    sBuilder.setCharAt(i+1, (char)((int)str.charAt(i+1)-32));
                }
            }
        }
        System.out.print(sBuilder.toString());
    }

    public static void main(String[] args) {
        String str = "hello this is debasish das";
        uppercase_first_and_last_char(str);
    }
}