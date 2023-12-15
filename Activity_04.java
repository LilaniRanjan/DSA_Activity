package dsa_activity_01;

import java.util.Scanner;

public class Activity_04 {

    public static void main(String[] args) {
        int count = 0, maxCount = 0, maxValue = 0;

        int fourth_array[] = new int[]{5, 3, 9, 6, 5, 6, 5, 6, 5};

        for (int i = 0; i < fourth_array.length; i++) {
            for (int j = 0; j < fourth_array.length; j++) {
                if (fourth_array[i] == fourth_array[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = fourth_array[i];
            }
            
            count = 0;
        }

        System.out.println("Activity 04");
        System.out.println("The maximum value is :" + maxValue + "\n\n");
    }
}
