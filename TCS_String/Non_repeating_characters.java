package TCS_String;

import java.util.HashMap;
import java.util.Map;

public class Non_repeating_characters {
    public static void non_repeated_char(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        char s[] = str.toCharArray();
        for(char ch : s){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey() + ",");
            }
        }
    }
    public static void main(String[] args) {
        String str = "yahoo";
        non_repeated_char(str);
    }
}
