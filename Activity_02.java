package dsa_activity_01;

public class Activity_02 {
    
    public static void main(String[] args){
        int secondQuestionArray[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int sum=0;
        
        for(int i=0; i<secondQuestionArray.length; i++){
            sum = sum + secondQuestionArray[i];
        }
        
        int average = (sum/secondQuestionArray.length);
        
        System.out.println("Activity 02");
        System.out.println("The average value of an array is " + average + "\n\n");
    }
}
