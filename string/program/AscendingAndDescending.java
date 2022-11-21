
package com.yash.string.program;
import java.util.Arrays;

public class AscendingAndDescending {
    public static void main(String[] args) {
        orderStr("scoot");
    }

    static void orderStr(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println("Ascending order:");
        for(char i:ch){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Descending order:");
        for(int i=ch.length-1 ; i>=0; i--){
            System.out.print(ch[i]+",");
        }
    }
}

