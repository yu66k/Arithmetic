package com.yc.arithmetic;

/**插入排序
 * Created by DockerYu on 2019/6/18.
 */
public class InsertionSort {
    //思想将数组想象成两部分，一部分是已排序，另一部分是未排序部分
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int value=arr[i];
            int k=i-1;
            for(;k>=0;k--){
                if(value<arr[k]){
                    //移动数据
                    arr[k+1]=arr[k];
                }else{
                    break;
                }
            }
            arr[k+1]=value;
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
