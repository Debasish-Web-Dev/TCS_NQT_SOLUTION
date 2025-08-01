package TCS_String;

public class anagram {
    public static void check_anagram(String str1, String str2){
        int total1 = 0;
        int total2 = 0;
        char s1[] = str1.toCharArray();
        char s2[] = str2.toCharArray();
        if(s1.length != s2.length){
            System.out.print("False");
            return;
        }else{
            for(int i=0;i<s1.length;i++){
                total1 += (int) s1[i];
                total2 += (int) s2[i];
            }
        }
        if(total1 == total2){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
    public static void main(String[] args) {
        String str1 = "INTEGER";
        String str2 = "TEGERNI";
        check_anagram(str1, str2);
    }
}
