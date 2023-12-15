package dsa_activity_01;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Activity_05 {
    public static void main(String[] args){
        
        System.out.println("Activity 04");
        
        Scanner sc = new Scanner(System.in);
        
        int len, ele, pos, ins_ele;
        System.out.println("Enter your array length:");
        len = sc.nextInt();
        
        int fifthquestion[] = new int[(len+1)];
        
        System.out.println("Enter your array elements:");
        for(int i=0; i<=(len-1); i++){
            ele = sc.nextInt();
            fifthquestion[i] = ele;
        }
        
        System.out.println("Insert the position you want to enter:");
        pos = sc.nextInt();
        
        System.out.println("Enter the element:");
        ins_ele = sc.nextInt();
        
        for(int z=len; z>(pos-1); z--){
            fifthquestion[z] = fifthquestion[z-1]; 
        }
        
        fifthquestion[pos-1] = ins_ele;
        
        System.out.println("Your array:");
        for(int j=0; j<fifthquestion.length; j++){
            System.out.print(fifthquestion[j] + " ");
        }
        
        System.out.println("\n\n");
    }
}
