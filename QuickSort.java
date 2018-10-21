package com.codingblock;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] nums ={23,12,74,33,98,1,9};
        quick(nums,0, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    public static void quick(int[] nums,int start, int end){

        if(end <= start){
            return;
        }
        int pivot = end - 1;
        pivot = pivotAdjust(nums,start,end,pivot);

        quick(nums,start,pivot);
        quick(nums,pivot+1,end);
    }

     public static int pivotAdjust(int[] nums,int start, int end,int pivot){

        int i = start;
        int j = start;

         for ( i = start; i < pivot ; i++) {
             if(nums[i] < nums[pivot]){
                 int t = nums[i];
                 nums[i] = nums[j];
                 nums[j] = t;
                 j++;
             }
         }

         int t = nums[j];
         nums[j] = nums[pivot];
         nums[pivot] = t;

         return j;
     }
}
