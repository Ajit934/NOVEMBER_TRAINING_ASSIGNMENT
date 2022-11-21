
package com.yash.array.program;
import java.util.*;

//WAP to find duplicate numbers and there counting from list of numbers
public class DuplicateNumArrQue2 {
    public static void main(String[] args) {
         int[] a = {3,9,0,2,3,2,9,9};
         FindingduplicateNumber(a);
    }

    static void FindingduplicateNumber(int[] a){
       Set<Integer> set =new HashSet<>();
       for(int i:a){
           set.add(i);
       }
       for(int i:set){
           int count = 0;
           for(int j=0;j<a.length;j++){
               if(i==a[j]){
                   count++;
               }
           }
          if(count>1){
              System.out.println("The duplicate element is "+i+" count is "+count);
          }
       }
    }
}



