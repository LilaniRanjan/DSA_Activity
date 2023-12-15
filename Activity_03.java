package dsa_activity_01;

public class Activity_03 {
    
    public static void main(String[] args){
        int thirtQuestionArray[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int min = thirtQuestionArray[0];
        int max = thirtQuestionArray[0];
        
        for(int i=0; i<thirtQuestionArray.length; i++){
            if(thirtQuestionArray[i]<min){
                min = thirtQuestionArray[i];
            }
            
            if(thirtQuestionArray[i]>max){
                max = thirtQuestionArray[i];
            }
        }
        
        System.out.println("Activity 03");
        System.out.println("The min value of an array is " + min);
        System.out.println("The max value of an array is " + max + "\n\n");
    }
}
