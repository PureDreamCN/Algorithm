/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:Algorithm
 * Module Name:TODO:Module
 */

/**
 * what:   希尔(Shell)排序又称为缩小增量排序，它是一种插入排序。它是直接插入排序算法的一种威力加强版。
 * 希尔排序中相等数据可能会交换位置,所以希尔排序是不稳定的算法。
 * 直接插入排序也适用于链式存储结构；希尔排序不适用于链式结构
 *
 * @author 郭飞 created on 2017/12/26
 */
public class ShellSort {

    public void sort(int[] a){
        int gap = a.length/2;
        while(gap>=1){
            //先找出步长为gap的数组,这里从数组的后半部分开始组合
            for(int j=gap;j<a.length;j++){
                //再分配gap步长的数组的时候进行排序
                for(int k = j;k>=gap&&less(a[k],a[k-gap]);k-=gap){
                    int val = a[k];
                    a[k]=a[k-gap];
                    a[k-gap] = val;
                }

            }
            for(int c:a){
                System.out.print(c+",");
            }
            System.out.println("*************");
            gap=gap/2;
       }


    }
    public boolean less(int a, int b){
        if(a<b){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){

        int[] a = {9,1,2,5,7,4,8,6,3,5};

        ShellSort chooseSort = new ShellSort();
        long start= System.currentTimeMillis();
        chooseSort.sort(a);
        long end =System.currentTimeMillis()-start;
        System.out.print("话费"+end);
    }
}
