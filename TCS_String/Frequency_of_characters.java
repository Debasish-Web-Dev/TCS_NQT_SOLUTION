package TCS_String;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_characters {
    public static void calculate_frequency(String str){
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
            System.out.print(entry.getKey() + " -> " + entry.getValue());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "takeuforward";
        calculate_frequency(str);
    }
}
