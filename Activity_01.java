package dsa_activity_01;

public class Activity_01 {
    
    public static void main(String[] args){
        int firstQuestionArray[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int sum=0;
        
        for(int i=0; i<firstQuestionArray.length; i++){
            sum = sum + firstQuestionArray[i];
        }
        
        System.out.println("Activity 01");
        System.out.println("The sum value of an array is " + sum + "\n\n");
    }
}
