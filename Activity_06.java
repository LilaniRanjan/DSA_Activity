package dsa_activity_01;

import java.util.Scanner;

public class Activity_06 {
    
    public static void main(String[] args){
        
        int len, ele, pos;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of your array:");
        len = sc.nextInt();
        int sixArray[] = new int[len];
        
        System.out.println("Enter the elements:");
        for(int i=0; i<len; i++){
            ele = sc.nextInt();
            sixArray[i] = ele;
        }
        
        System.out.println("Enter your position you have to remove:");
        pos = sc.nextInt();
        
        if(pos<0 || pos>len){
            System.out.println("Invalid position");
            return;
        }
        
        for(int j=(pos-1); j<(len-1); j++){
            sixArray[j] = sixArray[j+1];
        }
        
        len--;

        System.out.println("Your Array:");
        for(int z=0; z<len; z++){
            System.out.println(sixArray[z]);
        }
        
    }
}
