
package com.yash.string.program;
import java.util.*;
import java.util.stream.Collectors;


public class AlphabetCount_Que4 {
    public static void main(String[] args) {
        String s="how are you";
        countAplabet(s);

    }

    static void countAplabet(String s){
        Set<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        
        for(char i:set){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(i==s.charAt(j)){
                    count++;
                }
            }
            System.out.println(i+" : "+count);
        }
    }
}

