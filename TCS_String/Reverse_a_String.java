package TCS_String;

import java.util.Scanner;

public class Reverse_a_String {

    public static void reverse_string(String sc) {
        char[]str = sc.toCharArray();
        int start = 0;
        int end = str.length-1;
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        System.out.print(String.valueOf(str));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sc = s.nextLine();
        reverse_string(sc);
        s.close();
    }
}


