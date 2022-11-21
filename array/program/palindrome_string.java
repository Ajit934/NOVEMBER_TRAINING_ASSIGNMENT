
package com.yash.array.program;
import java.util.Arrays;


public class palindrome_string {
    public static void main(String[] args) {
        String[] a={"mom","jason","apple"};
        System.out.println(Arrays.toString(palinArr(a)));
    }

    static String[] palinArr(String[] a){
        int count=0;
        String out="";
        for(String i:a){
            String s="";
            for(char j:i.toCharArray()){
                s = j +s;
            }
            if(i.equals(s)){
                count++;
                out = s+" "+out;
            }
        }
        String[] result = out.split(" ");

        return result;
    }
}



