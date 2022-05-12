import java.io.*;
import java.util.*;

public class PrintAllDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Print_all_duplictes(s);
    }
    public static void Print_all_duplictes(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        for (Map.Entry ele : hm.entrySet()) {
            Character key = (Character)ele.getKey();
            int value = ((int)ele.getValue());
            if(value>1){
                System.out.println(key);
            }
        }
    }
}
