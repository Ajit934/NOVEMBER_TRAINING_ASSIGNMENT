
package com.yash.array.program;
import java.util.Arrays;


public class FindingLength_SortStrArr {
    public static void main(String[] args) {
        String[] a = {"apple","mango","grapes","goa","12"};
        System.out.println(Arrays.toString(sortStringarr(a)));
    }

    static String[] sortStringarr(String[] a){
        for(int i=0;i<a.length;i++){
            String temp;
            for(int j=i+1;j<a.length;j++){
                if(a[i].length()>a[j].length()){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}



