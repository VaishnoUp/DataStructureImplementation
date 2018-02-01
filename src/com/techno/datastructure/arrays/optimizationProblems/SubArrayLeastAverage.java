package com.techno.datastructure.arrays.optimizationProblems;

/**
 *
 * @author Vaishno Upadhyay
 * @since 23:01:2018:6:17
 * @apiNote subArray with least average
 *
 */
public class SubArrayLeastAverage {

    public static int leastAverage(int k, int array[]) {
        int avg = 0 , n;
        int temp = 0;
        int arrayLength = array.length;
        if(k <= arrayLength) {
            n = k;
            for(int i=0;i<arrayLength;i++) {
                for(int j = i; j<k ; j++){
                    temp = temp + array[j];
                }
                temp = temp /n;
                if(avg != 0 || avg > temp) {
                    avg = temp;
                }
                temp = 0;
                k++;
            }
        }
        return avg;

    }

    public static void main(String[] args) {
        int array[] = new int[]{3, 7, 90, 20, 10, 50, 40};
        int k = 3;
        System.out.println(SubArrayLeastAverage.leastAverage(k, array));
    }

}