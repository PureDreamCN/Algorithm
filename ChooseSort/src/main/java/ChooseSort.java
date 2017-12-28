/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:Algorithm
 * Module Name:TODO:Module
 */

/**
 * what:  1 每次比较都需要移动一次； 数据移动次数最少，只是数组的长度，排序大于需要N^2/2次;由内循环(n-1)+(n-2)+...+1=n(n-1)/2得出
 *    2运行时间和输入无关
 * @author 郭飞 created on 2017/12/26
 */
public class ChooseSort {

    public void sort(int[] a){
        int length = a.length;
        for(int i = 0;i<length;i++){
            int min = i;
            for(int j = i+1;j<length;j++){
                if(less(a[j],a[min])){
                    min = j;
                }
            }
            exchange(a,i,min);
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

        int[] a = new int[100000];
        for(int i=0;i<100000;i++){
            a[i]= i;
        }
        ChooseSort chooseSort = new ChooseSort();
        long start= System.currentTimeMillis();
        chooseSort.sort(a);
        long end =System.currentTimeMillis()-start;
        System.out.print("话费"+end);
    }
}
