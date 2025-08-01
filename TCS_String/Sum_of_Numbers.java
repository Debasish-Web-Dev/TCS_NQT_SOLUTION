package TCS_String;

public class Sum_of_Numbers {
    public static void Sum_of_Numbers_in_String(String str){
        String temp = "0";
        int sum = 0;
        int n = str.length();
        for(int i=0;i<n;i++){
            if(Character.isDigit(str.charAt(i))){
                temp = temp + str.charAt(i);
            }else{
                sum = sum + Integer.parseInt(temp);
                temp = "0";
            }
        }
        System.out.print(sum + Integer.parseInt(temp));
    }
    public static void main(String[] args) {
        String str = "1xyz23";
        Sum_of_Numbers_in_String(str);
    }
}
