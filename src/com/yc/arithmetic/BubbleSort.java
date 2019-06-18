package com.yc.arithmetic;

/**
 * 冒泡排序
 * Created by DockerYu on 2019/6/18.
 * 4，5，6，3，2，1 从小到大排序
 */
public class BubbleSort {
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //判断是否还需要冒泡
            boolean flag=false;
            for(int k=0;k<arr.length-1-i;k++){
                if(arr[k]>arr[k+1]){
                    int temp=arr[k+1];
                    arr[k+1]=arr[k];
                    arr[k]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={4,5,6,3,2,1};
        sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
