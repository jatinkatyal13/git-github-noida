package com.codingblock;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] nums ={23,12,74,33,98,1,9};
        mergeSortInPlace(nums,0, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] mergeSort(int [] nums){

        if (nums.length== 1){
          return nums;
        }

        int mid = nums.length/2;

        int[] first = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] second = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(first,second);
    }

    public static void mergeSortInPlace(int[] nums, int start, int end){
        if (end - start == 1){
            return;
        }

        int mid = (start + end)/2;

        mergeSortInPlace(nums, start, mid);
        mergeSortInPlace(nums, mid, end);

        mergeInPlace(nums, start, mid, end);
    }

    private static void mergeInPlace(int[] nums, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int k = 0;

        int[] mix = new int[end - start];

        while (i < mid && j < end){
            if (nums[i] < nums[j]){
                mix[k++] = nums[i++];
            } else {
                mix[k++] = nums[j++];
            }
        }

        while (i < mid){
            mix[k++] = nums[i++];
        }

        while (j < end){
            mix[k++] = nums[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            nums[start + l] = mix[l];
        }
    }


    public static int[] merge(int[] first,int[] second){

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){

            if( first[i] < second[j]){

                mix[k] = first[i];
                i++;
                k++;
            } else{
                mix[k] = second[j];
                j++;
                k++;
            }
        }

        while (i < first.length){
            mix[k]= first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k]= second[j];
            j++;
            k++;
        }

        return mix;
    }
}
