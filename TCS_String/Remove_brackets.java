package TCS_String;

// public class Remove_brackets {
//     public static void Brackets_remove(String str) {
//         int n = str.length();
//         String s = "";
//         for(int i=0;i<n;i++){
//             if(str.charAt(i) == '(' || str.charAt(i) == ')'){
//                 continue;
//             }else{
//                 s = s + str.charAt(i);

//             }
//         }
//         System.out.print(s);
//     }
//     public static void main(String[] args) {
//         String str = "(((a-b))+c)";
//         Brackets_remove(str);
//     }
// }


public class Remove_brackets {
    public static void Brackets_remove(String str){
        StringBuilder s = new StringBuilder("");
        int n = str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i) != '(' && str.charAt(i) != ')'){
                s.append(str.charAt(i));
            }
        }
        System.out.print(s.toString());
        
    }

    public static void main(String[] args) {
        String str = "(((a-b))+c)";
        Brackets_remove(str);
    }
}