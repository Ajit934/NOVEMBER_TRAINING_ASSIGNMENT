
package com.yash.string.program;
import java.util.Scanner;


public class String_Ques1 {
    public static void main(String[] args) {
        System.out.print("Enter the first string : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.print("Enter the second string : ");
        String s2 = sc.next();
        //char[] ch = s1.toCharArray();
        while(true) {
            System.out.print("Enter the index : ");
            int index = sc.nextInt();
            try {
                String result = s1.substring(0, index) + s2 + s1.substring(index, s1.length());
                System.out.println(result);
                break;
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


