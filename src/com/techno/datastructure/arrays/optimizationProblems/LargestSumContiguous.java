package com.techno.datastructure.arrays.optimizationProblems;

import java.util.Scanner;

/**
 * @author : Vaishno Upadhyay
 * @since :21:01:2018:23:10
 * @apiNote : Largest Sum Contiguous Subarray problem : Solving using Kadane’s Algorithm
 */
public class LargestSumContiguous {

    int array[] = new int[]{-2, -3, 3, 4, 5, -9, -6, 100,-200,-34,1};
    int max =0;
    int start = 0;
    boolean startPointer = false;

    private int largestSumContiguoussubArray(){
    for (int i=0; i<array.length;i++){
        if(array[i] >= 0 || startPointer){
            startPointer = true;
            start = start + array[i];
            if(max < start){
                max = start;
            }else continue;
        }

        }
        return max;
    }


    public static void main(String[] args) {
        LargestSumContiguous obj = new LargestSumContiguous();
    int largestSubArraySum = obj.largestSumContiguoussubArray();
        System.out.println(largestSubArraySum);
    }
}
