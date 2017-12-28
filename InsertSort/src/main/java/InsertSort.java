/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:Algorithm
 * Module Name:TODO:Module
 */

/**
 * what:    插入排序适合部分有序的数组十分高效，也适合小规模数组
 *
 * 平均情况下插入排序需要N^2/4比较以及N^2/4交换，最坏情况下比较及交换都需要N^2/2,最好情况下需要N-1次比较，0次交换
 * 直接插入排序是稳定的
 *
 * @author 郭飞 created on 2017/12/26
 */
public class InsertSort {
    public void sort(int[] a){
        int length = a.length;
        for(int i = 1;i<length;i++){
            for(int j = i;j>0&&less(a[j],a[j-1]);j--){
                exchange(a,j,j-1);
            }

        }
        for(int val:a){
            System.out.print(val+",");
        }
    }
    public boolean less(int a, int b){
        if(a<b){
            return true;
        }else{
            return false;
        }
    }
    public int[] exchange(int[] a, int index, int min){
        int val = a[index];
        a[index]=a[min];
        a[min] = val;
        return a;
    }
     public static void main(String[] args){

         int[] a = {2,0,4,5,6,3,33};

         InsertSort chooseSort = new InsertSort();
         long start= System.currentTimeMillis();
        chooseSort.sort(a);
        long end =System.currentTimeMillis()-start;
        System.out.print("话费"+end);
    }
}
