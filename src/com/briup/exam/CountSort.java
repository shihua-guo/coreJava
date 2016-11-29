package com.briup.exam;

import java.util.Arrays;

/**
 *@Description:<p>计数排序算法实现</p>
 *@author 王旭
 *@time 2016-3-4 下午4:52:02
 */
public class CountSort {
    
    public static void countSort(int[] arr) {
        if(arr == null || arr.length == 0)
            return ;
        
        int max = max(arr);
        
        int[] count = new int[max+1];
        Arrays.fill(count, 0);
        
        for(int i=0; i<arr.length; i++) {
            count[arr[i]] ++;
        }
        
        int k = 0;
        for(int i=0; i<=max; i++) {
            for(int j=0; j<count[i]; j++) {
                arr[k++] = i;
            }
        }
        
    }
    
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr) {
            if(ele > max)
                max = ele;
        }
        
        return max;
    }

}